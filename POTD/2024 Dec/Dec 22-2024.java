class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int m = mat.length;
        if (m == 0) return false;
        int n = mat[0].length;
        int row = 0;
        int col = n - 1;
        while (row < m && col >= 0) {
            if (mat[row][col] == x) {
                return true;
            } else if (mat[row][col] > x) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}