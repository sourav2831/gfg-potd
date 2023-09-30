//Replace O's with X's

class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isBorder(i,j,n,m) && a[i][j] == 'O'){
                    dfs(a,n,m,i,j,delRow,delCol);
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j] == '#'){
                    a[i][j] = 'O';
                }
                else{
                    a[i][j] = 'X';
                }
            }
        }
        return a;
    }
    
    public static boolean isBorder(int row,int col,int n,int m){
        if(row == 0 || col == 0 || row == n-1 || col == m-1){
            return true;
        }
        return false;
    }
    public static void dfs(char[][] a,int n,int m,int row,int col,int[] delRow,int[] delCol){
        a[row][col] = '#';
        for(int i=0;i<4;i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && a[nrow][ncol] == 'O'){
                dfs(a,n,m,nrow,ncol,delRow,delCol);
            }
        }
    }
}