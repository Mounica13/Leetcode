class Solution {
    
    private void markVisitedLand(char[][] grid,int i,int j, int row, int column) {
        if(i < 0 || i >= row || j < 0 || j >= column || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '2';
        markVisitedLand(grid, i, j - 1, row, column);
        markVisitedLand(grid, i, j + 1, row, column);
        markVisitedLand(grid, i - 1, j, row, column);
        markVisitedLand(grid, i + 1, j, row, column);
    }
    
    public int numIslands(char[][] grid) {
       
        
        int numberOfIslands = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    markVisitedLand(grid, i, j, grid.length, grid[0].length);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }
}