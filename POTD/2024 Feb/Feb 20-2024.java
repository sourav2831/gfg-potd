//Word Break

class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        HashSet<String> wordSet = new HashSet<>(dictionary);
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[len] ? 1 : 0;
    }
}