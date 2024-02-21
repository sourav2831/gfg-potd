//Distinct occurrences

class Solution
{
    int  subsequenceCount(String S, String T)
    {
int n=S.length();
       int m=T.length();
       int dp[][]=new int[n][m];
       int total=0;
       for(int i=n-1;i>=0;i--){
           if(S.charAt(i)==T.charAt(m-1)){
               total=(total+1)%(1000000007);
           }
           dp[i][m-1]=total;
       }
       for(int j=m-2;j>=0;j--){
           total=0;
           for(int i=n-1;i>=0;i--){
               if(S.charAt(i)==T.charAt(j) && i+1<n){
                   total=(total+dp[i+1][j+1])%(1000000007);
               }
               dp[i][j]=total;
           }
       }
       return dp[0][0];	
    }
}