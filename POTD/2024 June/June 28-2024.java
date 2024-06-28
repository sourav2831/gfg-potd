class Solution {
    public String pattern(int[][] arr) {
        String str = "";
        int n = arr.length;
        for(int i=0;i<n;i++){
            int[] palin = new int[n];
            for(int j=0;j<n;j++){
                palin[j] = arr[i][j];
            }
            if(palindrome(palin)){
                str = i+" R";
                return str;
            }
        }
        for(int i=0;i<n;i++){
            int[] palin = new int[n];
            for(int j=0;j<n;j++){
                palin[j] = arr[j][i];
            }
            if(palindrome(palin)){
                str = i+" C";
                return str;
            }
        }
        return "-1";
    }
    private boolean palindrome(int[] palin){
        if(palin.length==0){
            return false;
        }
        int n = palin.length;
        
        int count = 0;
        for(int i=0;i<n;i++){
            if(palin[i]!=palin[n-1-i]){
                return false;
            }
        }
        return true;
    }
}