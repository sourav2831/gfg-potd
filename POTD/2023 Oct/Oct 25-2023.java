//Knapsack with Duplicate Items

class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int memo[][]=new int[N+1][W+1];
        for(int row[]:memo){
            Arrays.fill(row,-1);
        }
        return knapSackUtil(N,W,val,wt,memo);
    }
    static int knapSackUtil(int N, int W, int val[], int wt[],int memo[][])
    {
        if(N==0||W==0)return 0;
        if(memo[N][W]!=-1)return memo[N][W];
        int ans=Integer.MIN_VALUE;
        if(wt[N-1]<=W){
            ans=knapSackUtil(N,W-wt[N-1],val,wt,memo)+val[N-1];
        }
        memo[N][W] = Math.max(ans,knapSackUtil(N-1,W,val,wt,memo));
        return memo[N][W];
    }
}