class Solution {
    int[] ans;
    int index;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ans = new int[numCourses];
        index = numCourses - 1;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] pathvisited = new boolean[numCourses];
        for(int i=0;i<numCourses;i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            graph.get(v).add(u);
        }
        for(int i=0;i<numCourses;i++) {
            if(!visited[i]) {
                if(dfs(graph,visited,pathvisited,i)) {
                    return new int[]{};
                }
            }
        }
        return ans;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> graph,boolean[]visited,boolean[]pathvisited,int node) {
        visited[node] = true;
        pathvisited[node] = true;
        for(int n : graph.get(node)) {
            if(!visited[n]) {
                if(dfs(graph,visited,pathvisited,n)) {
                    return true;
                }
            }
            else if(visited[n] && pathvisited[n]) {
                return true;
            }    
        }
        ans[index--] = node;
        pathvisited[node] = false;
        return false;
    }
}