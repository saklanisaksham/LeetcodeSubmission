class Solution {
    public int minPathSum(int[][] grid) {
        int col = grid.length;
        int row = grid[0].length;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(i==0 && j==0)
                    grid[i][j] = grid[i][j];
                else if(i==0 && j!=0)
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                else if(i!=0 && j==0)
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                else
                    grid[i][j] = grid[i][j] + Math.min(grid[i-1][j] , grid[i][j-1]);
            }
        }
        return grid[col-1][row-1];
    }
}