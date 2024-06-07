//Maximum occured integer

class Solution {
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int[] freq = new int[maxx + 2];
        for (int i = 0; i < n; i++) {
            freq[l[i]]++;
            freq[r[i] + 1]--;
        }
        int prefixSum = 0, maxxCount = Integer.MIN_VALUE, res = -1;
        for (int i = 0; i <= maxx; i++) {
            prefixSum += freq[i];
            if (prefixSum > maxxCount) {
                maxxCount = prefixSum;
                res = i;
            }
        }
        return res;
    }
}