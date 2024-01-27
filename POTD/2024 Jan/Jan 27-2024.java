//Brackets in Matrix Chain Multiplication

class Solution{
    static String matrixChainOrder(int p[], int n) {
        int[][] dp = new int[n][n];
        String[][] sdp = new String[n][n];
        for(int gap = 0; gap <= n; gap++) {
            for(int si = 0, ei = gap; ei < n; si++, ei++) {
                if(ei - si == 1) {
                    dp[si][ei] = 0;
                    sdp[si][ei] = (char) (si + 'A') + "";
                    continue;
                }

                int minAns = (int) 1e9;
                String minStr = "";
                for(int cut = si + 1; cut < ei; cut++) {
                    int rightAns = dp[si][cut];
                    int leftAns = dp[cut][ei];

                    if(minAns > rightAns + p[si] * p[cut] * p[ei] + leftAns) {
                        minAns = rightAns + p[si] * p[cut] * p[ei] + leftAns;
                        minStr = "(" + sdp[si][cut] + sdp[cut][ei] + ")";
                    }

                    dp[si][ei] = minAns;
                    sdp[si][ei] = minStr;
                }
            }
        }
        return sdp[0][n - 1];
    }
}
