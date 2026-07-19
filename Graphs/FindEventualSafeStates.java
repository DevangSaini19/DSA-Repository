class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        boolean[] pathvisited = new boolean[graph.length];
        boolean[] safe = new boolean[graph.length];
        for(int i=0;i<graph.length;i++) {
            if(!visited[i]) {
                dfs(graph,visited,pathvisited,safe,i);    
            }
        }
        for(int i=0;i<safe.length;i++) {
            if(safe[i]) {
                list.add(i);
            }
        }
        return list;
    }
    public boolean dfs(int[][] graph,boolean[] visited,boolean[]pathvisited,boolean[] safe,int node) {
        visited[node] = true;
        pathvisited[node] = true;
        for(int n : graph[node]) {
            if(!visited[n]) {
                if(dfs(graph,visited,pathvisited,safe,n)) {
                    return true;
                }
            }
            else if(pathvisited[n]) {
                return true;
            }
        }
        pathvisited[node] = false;
        safe[node] = true;
        return false;
    }
}