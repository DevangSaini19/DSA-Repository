class Pair {
    int rows;
    int cols;

    public Pair(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }
}
class Solution {
    public void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board[0].length;i++) {
            if(board[board.length-1][i]=='O' && !visited[board.length-1][i]) {
                bfs(board,visited,board.length-1,i);
            }
            if(board[0][i] == 'O' && !visited[0][i]) {
                bfs(board, visited, 0, i);
            }
        }
        for(int j=0;j<board.length;j++) {
            if(board[j][board[0].length-1]=='O' && !visited[j][board[0].length-1]) {
                bfs(board,visited,j,board[0].length-1);
            }
            if(board[j][0]=='O' && !visited[j][0]) {
                bfs(board, visited, j, 0);  
            }
        }
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j]=='O' && !visited[i][j]) {
                    board[i][j]= 'X';
                }
            }
        }
        }
        public void bfs(char[][] board, boolean[][]visited,int row,int col) {
            Queue<Pair> q = new LinkedList<>();
            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};
            q.offer(new Pair(row,col));
            visited[row][col] = true;
            while(!q.isEmpty()) {
                Pair p = q.poll();
                int r = p.rows;
                int c = p.cols;
                for(int i=0;i<dr.length;i++) {
                    int newRow = r + dr[i];
                    int newCol = c + dc[i];
                    if(newRow>=0 && newRow<board.length && newCol>=0 && newCol<board[0].length) {
                    if(board[newRow][newCol]=='O' && !visited[newRow][newCol]) {
                        q.offer(new Pair(newRow,newCol));
                        visited[newRow][newCol] = true;
                    }
                    }
                }
            }

        }
    }