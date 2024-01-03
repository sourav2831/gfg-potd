//Perfect Sum Problem

class Solution{
	public int perfectSum(int arr[],int n, int sum) { 
	    int memo[][]=new int[n+1][sum+1];
	    for(int row[]:memo){
	        Arrays.fill(row,-1);
	    }
	    return perfectSumUtil(arr,n,sum,memo);
	} 
	public int perfectSumUtil(int arr[],int n,int sum,int memo[][]){
	    int MOD=(int)(1e9+7);
	    if(n==1){
	        if(sum==0&&arr[n-1]==0)return 2;
	        if(sum==0)return 1;
	        return arr[n-1]==sum?1:0;
	    }
	    if(memo[n][sum]!=-1)return memo[n][sum];
	    int ans1=0;
	    if(arr[n-1]<=sum){
	        ans1=perfectSumUtil(arr,n-1,sum-arr[n-1],memo);
	    }
	    return memo[n][sum]=(ans1%MOD+perfectSumUtil(arr,n-1,sum,memo)%MOD)%MOD;
	}
}