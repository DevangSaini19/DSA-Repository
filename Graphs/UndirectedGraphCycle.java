// Geeks For Geeks
class Solution {
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++) {
            graph.add(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i=0;i<V;i++) {
            if(!visited[i]) {
                if(dfs(graph,visited,i,-1)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> graph,boolean[]visited,int node,int parent) {
        visited[node] = true;
        for(int n : graph.get(node)) {
            if(!visited[n]) {
                if (dfs(graph, visited, n, node)) {
                return true;
                }
            }
            else if(visited[n] && n != parent) {
                return true;
            }
        }
        return false;
    }
}