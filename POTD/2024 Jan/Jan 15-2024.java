//Grinding Geek

class Solution {
    public int max_courses(int n, int k, int[] arr) {
        int dp[][]=new int[k+1][arr.length+1];
        return solve(arr,k,0,dp);
    }
    public static int solve(int [] arr,int k,int i,int dp[][]){
        if(i==arr.length) return 0;
        if(dp[k][i]!=0)return dp[k][i];
        int a=0,b=0,c=0;
        if(k>=arr[i])a += 1+solve(arr,(k-arr[i])+(int)(Math.floor((0.9*arr[i]))),i+1,dp);
        b=solve(arr,k,i+1,dp);
        return dp[k][i]=Math.max(a,b);
    }
}