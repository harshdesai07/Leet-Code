public class leetcode289 {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int count = 0;
                if(i-1>=0 && j-1>=0 && Math.abs(board[i-1][j-1]) == 1) count++;
                if(i+1<m && j+1<n && Math.abs(board[i+1][j+1]) == 1) count++;
                if(i-1>=0 && j+1<n && Math.abs(board[i-1][j+1]) == 1) count++;
                if(i+1<m && j-1>=0 && Math.abs(board[i+1][j-1]) == 1) count++;
                if(i-1>=0 && Math.abs(board[i-1][j]) == 1) count++;
                if(j-1>=0 && Math.abs(board[i][j-1]) == 1) count++;
                if(i+1<m && Math.abs(board[i+1][j]) == 1) count++;
                if(j+1<n && Math.abs(board[i][j+1]) == 1) count++;

                if(board[i][j] == 1 && (count < 2 || count > 3)){
                    board[i][j] = -1;
                }
                else if(board[i][j] == 0 && count == 3) board[i][j] = -2;

            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == -1) board[i][j] = 0;
                else if(board[i][j] == -2) board[i][j] = 1;
            }
        }
    }
}
