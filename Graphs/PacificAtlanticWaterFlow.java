class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<heights[0].length;i++) {
            dfs(heights,pacific,0,i,-1);
        }
        for(int i=0;i<heights.length;i++) {
            dfs(heights,pacific,i,0,-1);
        }
        for(int i=0;i<heights[0].length;i++) {
            dfs(heights,atlantic,heights.length-1,i,-1);
        }
        for(int i=0;i<heights.length;i++) {
            dfs(heights,atlantic,i,heights[0].length-1,-1);
        }
        for(int i=0;i<heights.length;i++) {
            for(int j=0;j<heights[0].length;j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    list.add(Arrays.asList(i, j));
                }
            }
        }
        return list;

    }
    public void dfs(int[][] heights,boolean[][] visited, int row, int col,int prevHeight) {
        if(!(row>=0 && row<heights.length && col>=0 && col<heights[0].length) || visited[row][col] || heights[row][col] < prevHeight) {
            return;
        }
        visited[row][col] = true;
        dfs(heights,visited,row-1,col,heights[row][col]);
        dfs(heights,visited,row+1,col,heights[row][col]);
        dfs(heights,visited,row,col-1,heights[row][col]);
        dfs(heights,visited,row,col+1,heights[row][col]);
    }
}