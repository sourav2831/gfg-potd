//Max Sum without Adjacents

class Solution {
    int findMaxSum(int arr[], int n) {
        int take = arr[0], notTake = 0;
        for(int i=1; i<n; i++) {
            int newTake = notTake + arr[i];
            int newNotTake = Math.max(take, notTake);
            take = newTake;
            notTake = newNotTake;
        }
        return Math.max(take, notTake);
    }
}