class Solution {
    public boolean discover(int i, int j, int charloc, String word, int[][] visited, char[][] board) {
        if (board[i][j] != word.charAt(charloc)) {
            return false;
        } else {
            if (charloc == word.length() - 1) {
                return true;
            }

            // Check the right cell.
            if (j + 1 < board[0].length && visited[i][j + 1] == 0) {
                visited[i][j + 1] = -1;
                boolean ret = discover(i, j + 1, charloc + 1, word, visited, board);
                if (ret) {
                    return ret;
                }
                visited[i][j + 1] = 0;
            }

            // Check the down cell.
            if (i + 1 < board.length && visited[i + 1][j] == 0) {
                visited[i + 1][j] = -1;
                boolean ret = discover(i + 1, j, charloc + 1, word, visited, board);
                if (ret) {
                    return ret;
                }
                visited[i + 1][j] = 0;
            }

            // Check the left cell.
            if (j - 1 >= 0 && visited[i][j - 1] == 0) {
                visited[i][j - 1] = -1;
                boolean ret = discover(i, j - 1, charloc + 1, word, visited, board);
                if (ret) {
                    return ret;
                }
                visited[i][j - 1] = 0;
            }

            // Check the up cell.
            if (i - 1 >= 0 && visited[i - 1][j] == 0) {
                visited[i - 1][j] = -1;
                boolean ret = discover(i - 1, j, charloc + 1, word, visited, board);
                if (ret) {
                    return ret;
                }
                visited[i - 1][j] = 0;
            }
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        boolean exists = false;
        int[][] visited = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                visited[i][j] = -1;
                boolean ret = discover(i, j, 0, word, visited, board);
                if (ret) {
                    exists = true;
                    break;
                }
                visited[i][j] = 0;
            }
            if (exists) {
                break;
            }
        }
        return exists;
    }
}
