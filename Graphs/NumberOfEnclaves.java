class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for(int i=0;i<n;i++) {
            if(grid[grid.length-1][i]==1 && !visited[grid.length-1][i]) {
                dfs(grid,visited,grid.length-1,i);
            }
            if(grid[0][i]==1 && !visited[0][i]) {
                dfs(grid,visited,0,i);
            }
        }
        for(int j=0;j<m;j++) {
            if(grid[j][0]==1 && !visited[j][0]) {
                dfs(grid,visited,j,0);
            }
            if(grid[j][grid[0].length-1]==1 && !visited[j][grid[0].length-1]) {
                dfs(grid,visited,j,grid[0].length-1);
            }
        }
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==1 && !visited[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] grid, boolean[][] visited,int row,int col) {
        if(!(row>=0 && row<grid.length && col>=0 && col<grid[0].length) || visited[row][col] || grid[row][col]==0) {
            return;
        }
        visited[row][col] = true;
        dfs(grid,visited,row-1,col);
        dfs(grid,visited,row+1,col);
        dfs(grid,visited,row,col-1);
        dfs(grid,visited,row,col+1);
    }
}