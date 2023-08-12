import java.util.Arrays;
class Solution {
    int UniquePathUtil(int i,int j,int row,int col,int[][] obstacleGrid,int[][] paths){
        if(i==row || j==col)
            return 0;
        else if(obstacleGrid[i][j]==1)
            return 0;
        else if(i == row-1 && j == col-1)
            return 1 ;
        else if(paths[i][j]!=-1)
            return paths[i][j];
        else
            paths[i][j]=UniquePathUtil(i+1,j,row,col,obstacleGrid,paths)+UniquePathUtil(i,j+1,row,col,obstacleGrid,paths);
            return paths[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;

        int paths[][] = new int[row][col];
        for(int i=0;i<row;i++){
            Arrays.fill(paths[i],-1);
        }
        return UniquePathUtil(0,0,row,col,obstacleGrid,paths);
    }
}