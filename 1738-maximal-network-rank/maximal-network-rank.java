class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] count = new int[n];
        int[][] dir= new int[n][n];

        for(int[] road : roads){
            count[road[0]]++;
            count[road[1]]++;
            dir[road[0]][road[1]] = 1;
            dir[road[1]][road[0]] = 1;
        }
        int rank =0;
        for(int i = 0; i < n ; i++ ){
            for(int j= i+1 ; j < n ; j++){
                rank = Math.max(rank , count[i]+count[j]-dir[i][j]);
            }
        }
        return rank;
    }
}