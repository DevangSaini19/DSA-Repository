class Pair{
    int rows;
    int cols;

    public Pair(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    } 
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int[][] distance = new int[mat.length][mat[0].length];
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j]==0 && !visited[i][j]) {
                    q.offer(new Pair(i,j));
                    visited[i][j] = true;
                }
            }
        }
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.rows;
            int c = p.cols;
            for(int i=0;i<dr.length;i++) {
                int newRow = r + dr[i];
                int newCol = c + dc[i];
                if(newRow>=0 && newRow < mat.length && newCol>=0 && newCol<mat[0].length) {
                if(mat[newRow][newCol]==1 && !visited[newRow][newCol]) {
                    distance[newRow][newCol] = distance[r][c] + 1;
                    q.offer(new Pair(newRow,newCol));
                    visited[newRow][newCol] = true;
                }
            }
            }
        }
        return distance;
    }
    
}