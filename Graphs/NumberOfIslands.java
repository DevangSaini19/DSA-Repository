class Pair {
    int row;
    int col;

    public Pair(int row,int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]=='1' && !visited[i][j]) {
                count++;
                bfs(grid,visited,i,j);
                }
            }   
        }
        return count;

    }
    public void bfs(char[][] grid,boolean[][]visited, int row,int col) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(row, col));
        visited[row][col] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while(!q.isEmpty()) {
            Pair c = q.poll();
            int r = c.row;
            int b = c.col;
            for(int i=0;i<dr.length;i++) {
                int newRow = r + dr[i];
                int newCol = b + dc[i];
                if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length) {
                    if(grid[newRow][newCol]=='1' && !visited[newRow][newCol]) {
                        q.offer(new Pair(newRow,newCol));
                        visited[newRow][newCol] = true;
                    }
                }
            }
        }

    }
}