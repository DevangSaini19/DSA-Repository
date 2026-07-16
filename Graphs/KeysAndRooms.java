class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms,visited,0);
        for(int j=0;j<visited.length;j++) {
            if(!visited[j]) {
                return false;
            }
        }
        return true;
        
    }
    public void dfs(List<List<Integer>> rooms, boolean[] visited, int r) {
        visited[r] = true;
        for(int i=0;i<rooms.get(r).size();i++) {
            int next = rooms.get(r).get(i);
            if(!visited[next]) {
                dfs(rooms,visited,next);
            }
        }
    

    }
}