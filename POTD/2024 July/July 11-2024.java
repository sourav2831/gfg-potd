class Solution {
    public int MaxConnection(int grid[][]) {
        int n=grid.length;
        Map<Integer,Integer> compToCount = new HashMap<>();
        int id = 2;
        for(int i=0; i<n; i++)
        for(int j=0; j<n; j++){
            if(grid[i][j] != 1) continue;
            int count = dfs(grid, i, j, id);
            compToCount.put(id, count);
            id++;
        }
        int maxCnt = grid[0][0]==0 ? 1 : compToCount.get(grid[0][0]);
        Set<Integer> set = new HashSet<>(4);
        for(int i=0; i<n; i++)
        for(int j=0; j<n; j++){
            if(grid[i][j] != 0) continue;
            int cnt = 1;
            for(int[] dir : directions){
                int r = dir[0]+i, c = dir[1]+j;
                if(checkBounds(r, c, n) && grid[r][c]!=0 && set.add(grid[r][c]))
                    cnt+= compToCount.get(grid[r][c]);
            }
            if(cnt > maxCnt) maxCnt = cnt;
            set.clear();
        }    
        return maxCnt;
    }
    private static int dfs(int[][] grid, int i, int j, int id){
        grid[i][j] = id;
        int cnt = 1;
        for(int[] dir : directions){
            int r = dir[0]+i, c = dir[1]+j;
            if(checkBounds(r, c, grid.length) && grid[r][c]==1){
                cnt+= dfs(grid, r, c, id);
            }
        }
        return cnt;
    }
    private static int[][] directions = {{-1,0}, {1,0}, {0,1}, {0,-1}};
    private static boolean checkBounds(int i, int j, int n){
        return i>=0 && i<n && j>=0 && j<n;
    }
}