class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n=arr.length;
        int m=arr[0].length;
        int max=Integer.MIN_VALUE;
        int row=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1) count++;
            }
            if(count>max && count!=0){
                max=count;
                row=i;
            }
        }
        if(max==Integer.MIN_VALUE) return -1;
        return row;
    }
}