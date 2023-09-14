//Partition Equal Subset Sum

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        int i=0;
        while(i<N){
            sum+=arr[i++];
        }
        int dp[][]=new int[(sum/2)+1][N+1];
        if(sum%2!=0)return 0;
        sum/=2;
        i=0;
        while(i<=(N)){
            dp[0][i]=1;
            i++;
        }
        i=0;
        while(i<=(sum)){
            dp[i][0]=2;i++;
        }
        i=1;
        while(i<=(sum)){
            int j=1;
            while(j<=N){
                if(arr[j-1]>i){
                    dp[i][j]=dp[i][j-1]==1?1:2;
                }else dp[i][j]=dp[i][j-1]==1 || dp[i-arr[j-1]][j-1]==1?1:2;
                j++;
            }
            i++;
        }
        return dp[sum][N]==1?1:0;
    }
}