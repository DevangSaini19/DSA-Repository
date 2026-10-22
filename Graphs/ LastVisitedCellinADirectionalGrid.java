class Solution {
    int[] ans = new int[2];
    public int[] lastVisitedCell(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return dfs(grid,visited,0,0);
        }
    public int[] dfs(char[][] grid,boolean[][] visited,int r,int c) {
    if(r>=grid.length || r<0 || c>=grid[0].length || c<0 || visited[r][c]) {
        return ans;
    }
    visited[r][c] = true;
        ans = new int[]{r,c};
        if(grid[r][c]=='R') {
            return dfs(grid,visited,r,c+1);
        }
        else if(grid[r][c]=='L') {
            return dfs(grid,visited,r,c-1);
        }
        else if(grid[r][c]=='D') {
            return dfs(grid,visited,r+1,c);
        }
        else if(grid[r][c]=='U') {
            return dfs(grid,visited,r-1,c);
        }
        return ans;
    }
}