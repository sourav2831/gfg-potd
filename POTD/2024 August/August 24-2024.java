class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int dp[][]=new int[wt.length+1][W+1];
        for(int i[]:dp) Arrays.fill(i,-1);
        return recurse(wt,val,dp,0,W);
    }
    
  static  int recurse(int wt[],int val[],int dp[][],int i,int w){
        if(w<0) return 0;
        if(i>=wt.length) return 0;
        if(dp[i][w]!=-1) return dp[i][w];
       int a= recurse(wt,val,dp,i+1,w-wt[i]);
       int b= recurse(wt,val,dp,i+1,w);
       if(wt[i]<=w) a+=val[i];
      return dp[i][w]=Math.max(a,b);
    }
}