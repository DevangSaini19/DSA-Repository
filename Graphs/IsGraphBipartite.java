class Solution {
    public boolean isBipartite(int[][] graph) {
        char[] color = new char[graph.length];
        for(int i=0;i<graph.length;i++) {
            if(color[i] == '\0') {
                color[i] = 'R';
                if(!dfs(graph, color, i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph, char[] color, int a) {
        for(int i=0;i<graph[a].length;i++) {
            int next = graph[a][i];
            if(color[next]=='\0') {
                if(color[a] == 'R'){
                color[next] = 'B';
                }
                else{
                color[next] = 'R';
                }
                if(!dfs(graph, color, next)) {
                return false;
                }
            }  
            else if(color[next] == color[a]) {
                return false;
            }
        }
        return true;
    }
}