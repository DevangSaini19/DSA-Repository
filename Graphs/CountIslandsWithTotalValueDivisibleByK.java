class Solution {
    long sum = 0;
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j]!=0 && !visited[i][j]) {
                    sum = 0;
                    long a = dfs(visited,grid,i,j);
                    if(a%k==0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public long dfs(boolean[][] visited,int[][] grid,int r , int c) {
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0 || visited[r][c]) {
            return sum;
        }
        visited[r][c] = true;
        sum+=grid[r][c];
        dfs(visited,grid,r+1,c);
        dfs(visited,grid,r-1,c);
        dfs(visited,grid,r,c+1);
        dfs(visited,grid,r,c-1);
        return sum;
    }
}