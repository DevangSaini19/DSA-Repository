class Solution {
    class Pair{
        int row;
        int col;
        int move;

        Pair(int row,int col,int move) {
            this.row = row;
            this.col = col;
            this.move = move;
        }
    }
    public boolean canReach(int[] start, int[] target) {
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[8][8];
        q.offer(new Pair(start[0],start[1],0));
        visited[start[0]][start[1]] = true;
        int[][] dir = {
            {-2,-1},{-2,1},
            {-1,-2},{-1,2},{1,-2},
            {1,2},{2,-1}, {2,1}
        };
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int step = p.move;
            if(r==target[0] && c==target[1]) {
                return step%2==0;
            }
            for(int[] d : dir) {
                int nRow = r + d[0];
                int cCol = c + d[1];
                if(nRow>=0 && nRow<8 && cCol>=0 && cCol<8 && !visited[nRow][cCol]) {
                    visited[nRow][cCol] = true;
                    q.offer(new Pair(nRow,cCol,step+1));
                }
            } 
        }
        return false;
    }

}