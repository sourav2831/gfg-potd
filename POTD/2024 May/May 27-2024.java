//Longest subsequence-1

class Solution {
    static int res;
    public static int longestSubseq(int n, int[] a) {
        // code here
        res = 0;
        for(int i=0; i<n; i++){
            helper(a, 1, i+1, a[i]);
        }
        return res;
    }
    
    private static void helper(int[] arr, int c, int i, int ld){
        res = Math.max(res, c);
        for(int j=i; j<arr.length; j++){
            if(Math.abs(ld-arr[j]) == 1){
                helper(arr, c+1, j+1, arr[j]);
            }
        }
    }
}