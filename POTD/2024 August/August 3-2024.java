class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        int in[] = new int[n];
        int out[] = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    if(i != j){ in[j]++; out[i]++;}
                }
            }
        }
        for(int i=0; i<n; i++){
            if(in[i] == n-1 && out[i] == 0) return i;
        }
        return -1;
    }
}