package logic;

/**
 * 计算这个岛屿的周长
 * 输入:
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 *
 * 输出: 16
 */
public class IslandPerimeter {
    //直接遍历法
    public int islandPerimeter(int[][] grid) {
        if(grid.length == 0 || grid == null){
            return 0;
        }

        int length = grid.length;
        int width = grid[0].length;
        int c = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                if(grid[i][j] == 1){
                    if(i+1 >= length || grid[i+1][j] == 0)
                        c++;
                    if(i-1 < 0 || grid[i-1][j] == 0)
                        c++;
                    if(j+1 >= width || grid[i][j+1] == 0)
                        c++;
                    if(j-1 < 0 || grid[i][j-1] == 0)
                        c++;

                }
            }
        }
        return c;
    }

    //dfs
    public int islandPerimeter1(int[][] grid) {
        if(grid.length == 0 || grid == null){
            return 0;
        }

        int c = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    c = c + dfs(grid,i,j);
                }
            }
        }
        return c;
    }

    private int dfs(int[][] grid, int i, int j){

        if(!(i < grid.length && i >= 0 && j >=0 && j < grid[0].length))
            return 1;
        if(grid[i][j] == 0)
            return 1;
        if(grid[i][j] == 2)
            return 0;
        grid[i][j] = 2;
        return dfs(grid, i+1, j) + dfs(grid, i-1, j) +  dfs(grid, i, j+1)  + dfs(grid, i, j-1);

    }

//找到给定的二维数组中最大的岛屿面积
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int length = grid.length;
        int width = grid[0].length;
        int maxS = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                if(grid[i][j] == 1){
                    int res = dfsS(grid, i , j);
                    maxS = (maxS > res)? maxS:res;
                }
            }
        }
        return maxS;
    }
    private int dfsS(int[][] grid, int i, int j){
        if(!(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length)){
            return 0;
        }
        if(grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        return 1 + dfsS(grid , i+1, j) + dfsS(grid , i-1, j) + dfsS(grid , i, j+1) + dfsS(grid , i, j-1);
    }

    //请你计算网格中岛屿的数量
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;

        int length = grid.length;
        int width = grid[0].length;
        int res = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                if(grid[i][j] == '1'){
                    dfsNum(grid, i, j);
                    res++;
                }
            }
        }
        return res;

    }
    private void dfsNum(char[][] grid, int i, int j){
        if(!(i < grid.length && i >= 0 && j >=0 && j < grid[0].length))
            return;
        if(grid[i][j] == '0')
            return;
        if(grid[i][j] == '1')
            grid[i][j] = '0';

        dfsNum(grid, i+1, j);
        dfsNum(grid, i-1, j);
        dfsNum(grid, i, j + 1);
        dfsNum(grid, i, j - 1);

    }
}
