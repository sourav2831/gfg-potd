class Solution {
    int missingNumber(int n, int arr[]) {
        int total=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=array[i];
        }
        return total-sum;
    }
}