class Solution {
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][]=new int[n][m];
        int max=0;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[j][i-1]<grid[j][i]){
                    if(i==1 || dp[j][i-1]>0)
                        dp[j][i]=Math.max(dp[j][i],1+dp[j][i-1]);
                }
                
                if(j-1>=0 && grid[j-1][i-1]<grid[j][i]){
                     if(i==1 || dp[j-1][i-1]>0)
                        dp[j][i]=Math.max(dp[j][i],1+dp[j-1][i-1]);
                }
                
                if(j+1<grid.length && grid[j+1][i-1]<grid[j][i]){
                    if(i==1 || dp[j+1][i-1]>0) 
                        dp[j][i]=Math.max(dp[j][i],1+dp[j+1][i-1]);
                }
                
                max=Math.max(max,dp[j][i]);
        }
        }
        return max;
    }

}