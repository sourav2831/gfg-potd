//Find duplicate rows in a binary matrix

class Solution{
    private static boolean chk(int matrix[][], int r1, int r2, int m, int n){
        for(int i=0; i<n; i++){
            if(matrix[r1][i] != matrix[r2][i])
                return false;
        }
        return true;
    }
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0; i<m; i++){
            for(int j=i+1; j<m; j++){
                if(!st.contains(j) && chk(matrix, i, j, m, n)){
                    st.add(j);
                    ans.add(j);
                }
            }
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}