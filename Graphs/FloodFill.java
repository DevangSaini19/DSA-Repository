class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) {
            return image;
        }
        int n = image[sr][sc];
        Queue<Pair> q = new LinkedList<>();
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        q.offer(new Pair(sr, sc));
        image[sr][sc] = color; 
        while(!q.isEmpty()) {
        Pair current = q.poll();
        int r = current.row;
        int c = current.col;
        for (int i = 0; i < dr.length; i++) {
            int newRow = r + dr[i];
            int newCol = c + dc[i];
            if (newRow >= 0 && newRow < image.length && newCol>=0 && newCol < image[0].length){
            if(image[newRow][newCol]==n) {
                q.offer(new Pair(newRow,newCol));
                image[newRow][newCol] = color;
            }
        }
        }
        }
        return image;
    }
}