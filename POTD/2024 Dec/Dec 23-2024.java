class Solution {
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n=mat.length,m=mat[0].length;
        for(int i=0;i<n;i++){
            if(x<mat[i][0] || x>mat[i][m-1])continue;
                int left=0,right=m-1;
                while(left<=right){
                    int mid=left+(right-left)/2;
                    if(mat[i][mid]==x)return true;
                    else if(x>mat[i][mid])left=mid+1;
                    else right=mid-1;
                }
            }
        return false;
    }
}