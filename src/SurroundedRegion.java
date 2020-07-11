/*
130. Surrounded Regions
Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

Example:

X X X X
X O O X
X X O X
X O X X
After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X
Explanation:

Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'.
Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
 */
public class SurroundedRegion {

    public void solve(char[][] board) {

        if (board.length == 0 || board[0].length == 0) return;
        int m = board.length;
        int n = board[0].length;

        // loop first and last column.
        for (int i = 0; i < m; i++) {
            if(board[i][0] == 'O') fill(board, i, 0);

            if(board[i][n-1] == 'O') fill(board, i, n - 1);
        }

        //loop first and last row.
        for (int j = 0; j < n; j++) {
            if(board[0][j] == 'O') fill(board, 0, j);
            if(board[m-1][j] == 'O') fill(board, m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 'O')
                    board[i][j] ='X';
                else if(board[i][j] =='*')
                    board[i][j] ='O';
            }

        }
    }

    void fill(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length
                || j < 0 || j >= board[0].length) {
            return;
        }
        if (board[i][j] == 'X' || board[i][j] == '*') return;
        board[i][j] = '*';

        fill(board, i - 1, j);
        fill(board, i + 1, j);
        fill(board, i, j - 1);
        fill(board, i, j + 1);

    }

}
