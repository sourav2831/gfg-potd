//New Year Resolution

class Solution {
    public static boolean find(int idx,int sum,int coins[],Boolean dp[][]){
        if(sum>0 && (sum%20==0 || sum%24==0 || sum==2024)){
            return true;
        }
        if(idx>=coins.length){
            return false;
        }
        if(dp[idx][sum] != null){
            return dp[idx][sum];
        }
        return dp[idx][sum] = find(idx+1,sum+coins[idx],coins,dp) || find(idx+1,sum,coins,dp);
    }
    public static boolean isPossible(int N, int[] coins) {
        Boolean dp[][] = new Boolean[N][2025];
        return find(0,0,coins,dp);
    }
}