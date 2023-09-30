//Print first n Fibonacci Numbers

class Solution{
    public static long[] printFibb(int n) 
    {
        long dp[]=new long[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            if(i==1){
                dp[i]=1;
            }else
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp;
    }
}