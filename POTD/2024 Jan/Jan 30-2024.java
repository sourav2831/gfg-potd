//LCS of three strings

class Solution { 
    int LCSof3(String A, String B, String C, int n1, int n2, int n3){
        int memo[][][]=new int[n1+1][n2+1][n3+1];
        int i=0;
        while(i<=n1){
            int j=0;
            while(j<=n2){
                int k=0;
                while(k<=n3){
                    memo[i][j][k]=-1;
                    k++;
                }
                j++;
            }
            i++;
        }
        return LCSof3Util(A,B,C,n1,n2,n3,memo);
    } 
    int LCSof3Util(String A, String B, String C, int n1, int n2, int n3,int memo[][][]) 
    { 
        if(n1==0 || n2==0 || n3==0)return 0;
        if(memo[n1][n2][n3]!=-1)return memo[n1][n2][n3];
        if(A.charAt(n1-1)==B.charAt(n2-1) && B.charAt(n2-1)==C.charAt(n3-1)){
            memo[n1][n2][n3] = LCSof3Util(A,B,C,n1-1,n2-1,n3-1,memo)+1;
        }else memo[n1][n2][n3] = Math.max(LCSof3Util(A,B,C,n1-1,n2,n3,memo),Math.max(LCSof3Util(A,B,C,n1,n2-1,n3,memo),LCSof3Util(A,B,C,n1,n2,n3-1,memo)));
        return memo[n1][n2][n3];
    }
} 