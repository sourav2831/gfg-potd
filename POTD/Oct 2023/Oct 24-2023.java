//Palindromic Partitioning

class Solution{
    static int palindromicPartition(String str)
    {
        int n=str.length();
        int memo[][]=new int[n][n];
        boolean palindrome[][]=new boolean[n][n];
        int i=0;
        while(i<n){
            int j=0;
            while(j<n){
                palindrome[i][j]=isPalindrome(str,i,j);
                j++;
            }
            i++;
        }
        for(int row[]:memo){
            Arrays.fill(row,-1);
        }
        return palindromicPartitionUtil(str,0,n-1,memo,palindrome);
    }
    
    static int palindromicPartitionUtil(String str, int i, int j,int memo[][],boolean palindrome[][]){
        if(i>=j)return 0;
        if(palindrome[i][j])return 0;
        if(memo[i][j]!=-1)return memo[i][j];
        int r=i;
        int min=Integer.MAX_VALUE;
        while(r<j){
            int leftCost=memo[i][r]!=-1?memo[i][r]:palindromicPartitionUtil(str,i,r,memo,palindrome);
            memo[i][r]=leftCost;
            int rightCost=memo[r+1][j]!=-1?memo[r+1][j]:palindromicPartitionUtil(str,r+1,j,memo,palindrome);
            memo[r+1][j]=rightCost;
            int cost=leftCost+rightCost+1;
            min=Math.min(min,cost);
            r++;
        }
        return memo[i][j]=min;
    }
    
    static boolean isPalindrome(String str, int i, int j){
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}