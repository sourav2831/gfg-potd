//Anti Diagonal Traversal of Matrix

class Solution {
    public int[] antiDiagonalPattern(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        int ans[]=new int[r*c];
        int col=0;
        int row=0;
        int k=0;
        while(row<r){
            int i=row,j=col;
            while(i<r&&j>=0){
                ans[k]=matrix[i][j];
                k++;
                i++;
                j--;
            }
            col++;
            if(col>=c){
                row++;
                col=c-1;
            }
        }
        return ans;
    }
}