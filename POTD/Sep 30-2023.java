//Boolean Matrix

class Solution {
    void booleanMatrix(int matrix[][]) {
        // code here
        int row[] = new int[matrix.length];
        int column[] = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 1){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            for(int j=0;j<column.length;j++){
                if(row[i] == 1 || column[j] == 1){
                    matrix[i][j]=1;
                }
            }
        }
    }
}