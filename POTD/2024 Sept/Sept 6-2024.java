class Solution {
    long maxSubarraySum(int[] arr) {
        int len = arr.length;
        int i = 1;
        long maxSum = arr[0];
        long localSum = arr[0];
        while(i<len){
            if(localSum<0)localSum=0;
            localSum+=arr[i];
            maxSum = Math.max(localSum,maxSum);
            i++;
        }
        return maxSum;
    }
}