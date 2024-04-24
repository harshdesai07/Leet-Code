class Solution {
    public void dfs(char[][] arr, int i, int j){
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j] != 'O') return;

        arr[i][j] = '#';

        dfs(arr, i+1, j);
        dfs(arr, i-1, j);
        dfs(arr, i, j+1);
        dfs(arr, i, j-1);
    }
    
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;


        for(int i=0; i<n; i++){
            if(board[i][0] == 'O') dfs(board, i, 0);
            if(board[i][m-1] == 'O') dfs(board, i, m-1);
        }

        for(int j=0; j<m; j++){
            if(board[0][j] == 'O') dfs(board, 0, j);
            if(board[n-1][j] == 'O') dfs(board, n-1, j);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == '#') board[i][j] = 'O';
            }
        }


    }
}
