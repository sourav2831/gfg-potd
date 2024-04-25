//Maximum sum of hour glass

class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        if(n < 3 || m < 3) return -1;
        int sum = Integer.MIN_VALUE;
        for(int i = 0 ; i <= mat.length-3 ; i++){
            for(int j = 0 ; j<= mat[0].length-3 ; j++){
                int s = (mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2])%1000000007;
                sum = Math.max(sum,s);
            }
        }
        return sum;
    }
};