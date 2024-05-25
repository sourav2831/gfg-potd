//You and your books

class Solution {
    long max_Books(int arr[], int n, int k) {
        // Your code here
        long res = 0,currSum = 0;
        int idx = 0;
        while(idx<n){
            currSum += arr[idx];
            if(arr[idx++] > k)
                currSum = 0;
            res = Math.max(res,currSum);
        }
        return res;
    }
}