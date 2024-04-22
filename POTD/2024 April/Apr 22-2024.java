//Row with minimum number of 1's

class Solution {
    int minRow(int n, int m, int a[][]) {
        int res=1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
            int minn= Math.min(count, min);
            if(minn!=min){
                res=i+1;
                min=minn;
            }
        }
        return res;
    }
};