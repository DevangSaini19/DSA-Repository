class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        List<Boolean> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] Indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            graph.get(u).add(v);
            Indegree[v]++;
        }
        for(int i=0;i<Indegree.length;i++) {
            if(Indegree[i]==0) {
                q.offer(i);
            }
        }
        HashSet<Integer>[] pre = new HashSet[numCourses];
        for(int i = 0; i < numCourses; i++) {
            pre[i] = new HashSet<>();
        }
        while(!q.isEmpty()) {
            int node = q.poll();
            for(int n : graph.get(node)) {
                pre[n].add(node);
                pre[n].addAll(pre[node]);
                Indegree[n]--;
                if(Indegree[n]==0) {
                    q.offer(n);
                }
            }
        }
        for(int i=0;i<queries.length;i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            if(pre[v].contains(u)) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    } 
}