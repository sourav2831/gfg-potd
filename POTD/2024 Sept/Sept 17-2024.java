class Solution {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int minDiff = arr[n-1] - arr[0];
        int i = 1;
        while(i<n){
            if(arr[i]-k>=0){
                int min = Math.min(arr[0]+k,arr[i]-k);
                int max = Math.max(arr[n-1]-k, arr[i-1]+k);
                minDiff = Math.min(max-min, minDiff);
            }
            i++;
        }
        return minDiff;
    }
}
