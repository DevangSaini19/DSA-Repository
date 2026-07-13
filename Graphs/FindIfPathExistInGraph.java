class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();
    boolean[] visited = new boolean[n];
    for(int i=0;i<n;i++) {
        graph.add(i,new ArrayList<>());
    }
    for(int j=0;j<edges.length;j++) {
        int u = edges[j][0];
        int v = edges[j][1];
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    q.offer(source); 
    visited[source] = true;
    while(!q.isEmpty()) {
        int current = q.poll();
        if(current==destination) {
            return true;
        }
    graph.get(current);
    for(int i=0;i<graph.get(current).size();i++) {
        if(visited[graph.get(current).get(i)]==false) {
        q.offer(graph.get(current).get(i));
        visited[graph.get(current).get(i)] = true;
        }
    }
    }
    return false;
    }
}