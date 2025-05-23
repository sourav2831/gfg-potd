class Solution {
    minDeletions(s) {
        const n = s.length;
        const reversedS = s.split("").reverse().join(""); // Reverse the string

        // Initialize DP Table
        const dp = Array.from({ length: n + 1 }, () => Array(n + 1).fill(0));

        // Compute Longest Common Subsequence (LCS)
        for (let i = 1; i <= n; i++) {
            for (let j = 1; j <= n; j++) {
                if (s[i - 1] === reversedS[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Minimum deletions required
        return n - dp[n][n];
    }
}

