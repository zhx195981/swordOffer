package logic;

/**
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 *
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 *
 * 示例:
 *
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 运行你的函数后，矩阵变为：
 *
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 *
 *
 * 深度优先算法
 */
public class areaS {
    int length;
    int width;
    public void solve(char[][] board) {
        length = board.length;
        if(length == 0)
            return;
        width = board[0].length;
        for(int i = 0; i < length; i++){
            dfs(board, i, 0);
            dfs(board, i, width-1);
        }

        for(int i = 1; i < width-1; i++){
            dfs(board, 0, i);
            dfs(board, length-1, i);
        }

        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                if(board[i][j] == 'A')
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }


    }

    public void dfs(char[][] board,int x, int y){
        if(x < 0 || x >= length || y < 0 || y >= width || board[x][y] != 'O')
            return;
        board[x][y] = 'A';
        dfs(board, x-1, y);
        dfs(board, x+1, y);
        dfs(board, x, y-1);
        dfs(board, x, y+1);

    }

}
