//Better String

class Solution {
    public static String betterString(String str1, String str2) {
        int x = countSub(str1);
        int y = countSub(str2);
        if (x < y) return str2;
        return str1;
    }
    static int countSub(String str) {
        Map<Character, Integer> mpp = new HashMap<>();
        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = 2 * dp[i - 1];
            if (mpp.containsKey(str.charAt(i - 1))) {
                dp[i] = dp[i] - dp[mpp.get(str.charAt(i - 1))];
            }
            mpp.put(str.charAt(i - 1), i - 1);
        }
        return dp[n];
    }
}