//Gold Mine Problem

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int i=0;
        int ans=0;
        int memo[][]=new int[n+1][m+1];
        for(int row[]:memo){
            Arrays.fill(row,-1);
        }
        while(i<n){
            ans = Math.max(ans,maxGoldUtil(n,m,M,i,0,memo));
            i++;
        }
        return ans;
    }
    static int maxGoldUtil(int n, int m, int M[][],int row,int col,int memo[][]){
        if(row<0 || row>=n || col<0 ||col>=m)return 0;
        if(memo[row][col]!=-1)return memo[row][col];
        memo[row][col] = M[row][col]+Math.max(maxGoldUtil(n,m,M,row-1,col+1,memo),Math.max(maxGoldUtil(n,m,M,row,col+1,memo),maxGoldUtil(n,m,M,row+1,col+1,memo)));
        return memo[row][col];
    }
}