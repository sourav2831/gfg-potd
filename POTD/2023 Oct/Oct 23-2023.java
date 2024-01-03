//Maximum sum increasing subsequence

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    int memo[][]=new int[n+1][n+2];
	    for(int row[]:memo){
	        Arrays.fill(row,-1);
	    }
	    return maxSumISUtil(arr,n,-1,memo);
	}
	public int maxSumISUtil(int arr[],int n,int prev,int memo[][]){
	    if(n==0)return 0;
	    if(memo[n][prev+1]!=-1)return memo[n][prev+1];
	    int ans=Integer.MIN_VALUE;
	    if(prev==-1 || arr[prev-1]>arr[n-1]){
	        ans = maxSumISUtil(arr,n-1,n,memo)+arr[n-1];
	    }
	    memo[n][prev+1] = Math.max(ans,maxSumISUtil(arr,n-1,prev,memo));
	    return memo[n][prev+1];
	}
}