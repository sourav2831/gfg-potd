//Shortest Common Supersequence

class Solution {
    public static int shortestCommonSupersequence(String X,String Y,int m,int n) {
        int dp[][]=new int[m+1][n+1];
        int i=1;
        while(i<=m){
            int j=1;
            while(j<=n){
                if(X.charAt(i-1)==Y.charAt(j-1))dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                j++;
            }
            i++;
        }
        return m+n-dp[m][n];
    }
}