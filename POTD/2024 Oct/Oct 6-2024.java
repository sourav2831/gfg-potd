class Solution {
    private final int[][] directions = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1}, 
        {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int numRows = grid.length;
        int numCols = grid[0].length;
        int islandCount = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    dfsIterative(grid, i, j, numRows, numCols);
                }
            }
        }
        return islandCount;
    }
    private void dfsIterative(char[][] grid, int i, int j, int numRows, int numCols) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        grid[i][j] = '0';
        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int currRow = current[0];
            int currCol = current[1];
            for (int[] direction : directions) {
                int newRow = currRow + direction[0];
                int newCol = currCol + direction[1];
                if (newRow >= 0 && newRow < numRows && newCol >= 0 && newCol < numCols && grid[newRow][newCol] == '1') {
                    stack.push(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0';
                }
            }
        }
    }
}