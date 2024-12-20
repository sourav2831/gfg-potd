class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        int i = 0;
        int j = 0;
        int row_0 = 0;
        int col_0 = 0;
        int row_1 = mat.length-1;
        int col_1 = mat[0].length-1;
        int left[] = new int[]{0 , -1};
        int right[] = new int[]{0 , 1};
        int up[] = new int[]{-1 , 0};
        int down[] = new int[]{1 , 0};
        int []dir = right;
        int n = (row_1 + 1) * (col_1 + 1);
        ArrayList<Integer> A = new ArrayList<>();
        
        while(n-- > 0) {
            A.add(mat[i][j]);
            if(dir == right) {
                if(j == col_1) {
                    dir = down;
                    row_0++;
                    i++;
                } else {
                    j++;
                }
            } else if(dir == left) {
                if(j == col_0) {
                    dir = up;
                    row_1--;
                    i--;
                } else {
                    j--;
                }
            } else if(dir == up) {
                if(i == row_0) {
                    dir = right;
                    col_0++;
                    j++;
                } else {
                    i--;
                }
            } else if(dir == down) {
                if(i == row_1) {
                    dir = left;
                    col_1--;
                    j--;
                } else {
                    i++;
                }
            }
        }
        
        return A;
    }
}