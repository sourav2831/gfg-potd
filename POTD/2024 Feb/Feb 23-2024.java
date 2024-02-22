//Buy and Sell a Share at most twice

class Solution {
    public static int maxProfit(int n, int[] price) {
        int dp[][][]=new int[n+1][2][3];
        int i=n-1;
        while(i>=0){
            int j=0;
            while(j<2){
                int k=1;
                while(k<3){
                    if(j==1){
                        dp[i][j][k] = Math.max(-price[i]+dp[i+1][0][k],dp[i+1][1][k]);
                    }else{
                        dp[i][j][k] = Math.max(price[i]+dp[i+1][1][k-1],dp[i+1][0][k]);
                    }
                    k++;
                }
                j++;
            }
            i--;
        }
        return dp[0][1][2];
    }
}