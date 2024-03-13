//Print matrix in diagonal pattern

class Solution {
    public int[] matrixDiagonally(int[][] arr) {
        int n = arr.length;
        if (n == 1) return new int[]{arr[0][0]};
        int[] ans = new int[n*n];
        int k = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                int row = i, col = 0;
                while (row >= 0){
                    ans[k++] = arr[row][col];
                    row--;
                    col++;
                }
            } else {
                int row = 0, col = i;
                while (col >= 0){
                    ans[k++] = arr[row][col];
                    col--;
                    row++;
                }
            }
        }
        for (int i = 1; i < n; i++){
            if (n % 2 == 1){
                if (i % 2 == 0){
                    int row = n - 1, col = i;
                    while (col <= n-1){
                        ans[k++] = arr[row][col];
                        row--;
                        col++;
                    }
                } else {
                    int col = n - 1, row = i;
                    while (row <= n-1){
                        ans[k++] = arr[row][col];
                        col--;
                        row++;
                    }
                }
            } else {
                if (i % 2 == 1){
                    int row = n - 1, col = i;
                    while (col <= n-1){
                        ans[k++] = arr[row][col];
                        row--;
                        col++;
                    }
                } else {
                    int col = n - 1, row = i;
                    while (row <= n-1){
                        ans[k++] = arr[row][col];
                        col--;
                        row++;
                    }
                }
            }
        }
        
        return ans;
    }
}