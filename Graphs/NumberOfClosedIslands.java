class Solution {
    public int closedIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==0 && !visited[i][j]) {
                if(dfs(grid,visited,i,j)){
                    count++;
                    }
                }
                
            }
        }
        return count;   
    }
    public boolean dfs(int[][] grid,boolean[][] visited,int row,int col) {
        if(!(row>=0 && row<grid.length && col>=0 && col<grid[0].length)) {
            return false;
        }
        if(grid[row][col]==1 || visited[row][col]) {
            return true;
        }
        visited[row][col] = true;
        boolean up = dfs(grid,visited,row-1,col);
        boolean down = dfs(grid,visited,row+1,col);
        boolean left = dfs(grid,visited,row,col-1);
        boolean right = dfs(grid,visited,row,col+1);
        return up && down && left && right;
    }
}