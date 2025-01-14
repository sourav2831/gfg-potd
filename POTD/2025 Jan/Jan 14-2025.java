class Solution {
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        int halfSum = 0;
        for(int i=0; i<n; i++){
            sum -= arr[i];
            if(i==0 && sum == halfSum) return i;
            if(i == 0) continue;
            halfSum += arr[i - 1];
            if(halfSum == sum) return i;
        }
        return -1;
    }
}