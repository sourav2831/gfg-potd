class Solution {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1, high = n - 1;
            while (low < high) {
                int sum = arr[i] + arr[low] + arr[high];
                if (sum == target) {
                    count++;
                    int tempLow = low + 1;
                    int tempHigh = high - 1;
                    while (tempLow < high && arr[tempLow] == arr[low]) {
                        count++;
                        tempLow++;
                    }
                    while (tempHigh > low && arr[tempHigh] == arr[high]) {
                        count++;
                        tempHigh--;
                    }
                    low++;
                    high--;
                } else if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return count;
    }
}