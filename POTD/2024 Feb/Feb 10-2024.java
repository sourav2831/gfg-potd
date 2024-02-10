//Number of paths in a matrix with k coins

class Solution {
    long cnt;
    long numberOfPath(int n, int k, int [][]arr) {
        cnt=0;
        solve(0,0,k,arr,n);
        return cnt;
    }
    void solve(int i,int j,int k,int arr[][],int n){
        if(k<0|| i>=n ||j>=n)return;
        k=k-arr[i][j];
        if( i==n-1 && j==n-1 ){
            if(k==0)
            cnt++;
            return;
        }
        solve(i+1,j,k,arr,n);
        solve(i,j+1,k,arr,n);
        return;
    }
}