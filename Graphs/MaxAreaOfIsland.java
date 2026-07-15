class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        int maxArea = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==1 && !visited[i][j]) {
                count = dfs(grid,visited,i,j);
                maxArea = Math.max(maxArea,count);
                }
                
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid,boolean[][] visited,int row,int col) {
        if(!(row>=0 && row<grid.length && col>=0 && col<grid[0].length) || grid[row][col]==0 || visited[row][col]) {
            return 0;
        }
        visited[row][col] = true;
        return 1 + dfs(grid,visited,row-1,col) + dfs(grid,visited,row+1,col) + dfs(grid,visited,row,col-1) + dfs(grid,visited,row,col+1);
        
    }
}