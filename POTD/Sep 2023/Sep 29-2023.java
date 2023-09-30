//Number Of Enclaves

class Solution {
    int numberOfEnclaves(int[][] grid) {
        int i=0;
        int n= grid.length;
        int m=grid[0].length;
        int ans=0;
        boolean visited[][]=new boolean[n][m];
        while(i<n){
            if(!visited[i][0]){
                dfs(grid,i,0,visited,n,m);
            }
            if(!visited[i][m-1]){
                dfs(grid,i,m-1,visited,n,m);
            }
            i++;
        }
        i=0;
        while(i<m){
            if(!visited[0][i]){
                dfs(grid,0,i,visited,n,m);
            }
            if(!visited[n-1][i]){
                dfs(grid,n-1,i,visited,n,m);
            }
            i++;
        }
        i=0;
        while(i<n){
            int j=0;
            while(j<m){
                if(grid[i][j]==1)ans++;
                j++;
            }
            i++;
        }
        return ans;
    }
    void dfs(int [][] grid, int row, int col,boolean visited[][] ,int n, int m){
        if(row>=n || row<0 || col>=m || col<0 || grid[row][col]==0 || visited[row][col])return;
        visited[row][col]=true;
        grid[row][col]=0;
        dfs(grid,row-1,col,visited,n,m);
        dfs(grid,row,col+1,visited,n,m);
        dfs(grid,row+1,col,visited,n,m);
        dfs(grid,row,col-1,visited,n,m);
    }
}