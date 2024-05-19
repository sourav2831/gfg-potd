//Find the closest number

class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        int r = arr[0];
        int t = Math.abs(arr[0] - k);
        for (int x = 1; x < arr.length; x++) {
            int p = Math.abs(arr[x] - k);
            if ((p < t) || (p == t && arr[x] > r)) {
                t = p;
                r = arr[x];
            }
        }
        return r;
    }
}