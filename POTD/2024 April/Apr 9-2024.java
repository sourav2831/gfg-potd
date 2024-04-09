//Minimum Points To Reach Destination

class Solution
{
	public int minPoints(int points[][],int M,int N) 
	{ 
	    int memo[][]=new int[M+1][N+1];
	    for(int row[]:memo){
	        Arrays.fill(row,(int)(Integer.MIN_VALUE+1e4));
	    }
	    return 1+Math.abs(minPointsUtil(points,M,N,0,0,memo));
	} 
	public int minPointsUtil(int points[][],int M,int N,int i, int j,int memo[][]){
	    if(i==M-1 && j==N-1){
	        if(points[i][j]<=0)return points[i][j];
	        return 0;
	    }
	    if(i>=M || j>=N)return (int)(Integer.MIN_VALUE+1e4);
	    if(memo[i][j]!=(int)(Integer.MIN_VALUE+1e4))return memo[i][j];
	    int down=points[i][j]+minPointsUtil(points,M,N,i+1,j,memo);
	    int right=points[i][j]+minPointsUtil(points,M,N,i,j+1,memo);
	    if(down>0)down=0;
	    if(right>0)right=0;
	    return memo[i][j]=Math.max(down,right);
	}
}