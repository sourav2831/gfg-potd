//Max Sum Subarray of size K

class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        // code here
        long sum = 0;
        int i = 0;
        while(i<k){
            sum += arr.get(i++);
        }
        long max = sum;
        while(i < n){
            sum -= arr.get(i - k);
            sum += arr.get(i);
            max = Math.max(max,sum);
            i++;
        }
        return max;
    }
}