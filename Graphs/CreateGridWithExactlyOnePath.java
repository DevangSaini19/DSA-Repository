class Solution {
    public String[] createGrid(int m, int n) {
        String[] temp = new String[m];
        char[][] arr = new char[m][n];
        boolean[][] visited = new boolean[m][n];
        dfs(arr,visited,m,n,0,0);
        int index = 0;
        for(int i=0;i<arr.length;i++) {
            String ans = "";
            for(int j=0;j<arr[0].length;j++) {
                if(!visited[i][j]) {
                    ans+='#';
                }
                else {
                ans+=arr[i][j];
                }
            }
            temp[index++] = ans;
        }
        return temp;
    }
    public void dfs(char[][] arr,boolean[][] visited,int m,int n,int r,int c) {
        if(r<0 || r>=m || c<0 || c>=n || visited[r][c] || visited[m-1][n-1] ) {
            return;
        }
        visited[r][c] = true;
        arr[r][c] = '.';
        dfs(arr,visited,m,n,r,c+1);
        dfs(arr,visited,m,n,r+1,c);
    }
}