//Techfest and the Queue

class Solution {
    static int prime(long val) {
        int ans = 0;
        for (int i = 2; i * i <= val; i++) {
            while (val % i == 0) {
                ans++;
                val /= i;
            }
        }
        if (val > 1) {
            ans++;
        }
        return ans;
    }
    public static long sumOfPowers(long a, long b) {
        long ans = 0;
        for (long i = a; i <= b; i++) {
            ans += prime(i);
        }
        return ans;
    }
}