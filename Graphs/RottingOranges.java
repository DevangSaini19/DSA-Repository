class Pair{
    int row;
    int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    int minutes = 0;
    int fresh = 0;
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==2) {
                    q.offer(new Pair(i,j));
                }
                else if(grid[i][j]==1) {
                    fresh++;
                }
            }  
        }
        bfs(grid,q);
        if(fresh!=0) {
            return -1;
        }
        return minutes;
    }
    public void bfs(int[][] grid,Queue<Pair> q) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while(!q.isEmpty()) {
        int size = q.size();
        boolean infect = false;
        for(int j=0;j<size;j++)  {
            Pair c = q.poll();
            int r = c.row;
            int b = c.col;
            for(int i=0;i<dr.length;i++) {
                int newRow = r + dr[i];
                int newCol = b + dc[i];
                if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length) {
                    if(grid[newRow][newCol]==1) {
                        q.offer(new Pair(newRow,newCol));
                        grid[newRow][newCol]=2;
                        fresh--;
                        infect = true;
                    }
                }
            }
        }
        if(infect) {
        minutes++;
        }
        }
    }
}