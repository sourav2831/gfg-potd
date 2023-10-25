//Minimum Operations

class Solution {
    public int minOperation(int n) {
        int dp[]=new int[n+1];
        int i=1;
        while(i<=n){
            int result1=Integer.MAX_VALUE;
            if(i%2==0)result1=dp[i/2];
            dp[i]=Math.min(result1,dp[i-1])+1;
            i++;
        }
        return dp[n];
    }
}