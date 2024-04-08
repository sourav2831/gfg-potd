//Optimal Strategy For A Game

class solve {
    static long f(int i, int j, int n, int[] arr, long[][] dp) {
        if (i > j || i >= n || j < 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        long tookFirst = arr[i] + Math.min(f(i + 2, j, n, arr, dp), f(i + 1, j - 1, n, arr, dp));
        long tookLast = arr[j] + Math.min(f(i, j - 2, n, arr, dp), f(i + 1, j - 1, n, arr, dp));
        return dp[i][j] = Math.max(tookFirst, tookLast);
    }
    
    static long countMaximum(int n, int[] arr) {
        long[][] dp = new long[n + 1][n + 1];
        for (long[] cur : dp) {
            Arrays.fill(cur, -1);
        }
        return f(0, n - 1, n, arr, dp);
    }
}