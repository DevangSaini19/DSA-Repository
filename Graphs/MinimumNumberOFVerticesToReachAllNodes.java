class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    List<Integer> list = new ArrayList<>();
    int[] Indegree = new int[n];
    for(int i=0;i<edges.size();i++) {
        int u = edges.get(i).get(0);
        int v = edges.get(i).get(1);
        Indegree[v]++;
    }
    for(int i=0;i<Indegree.length;i++) {
        if(Indegree[i]==0) {
            list.add(i);
        }
    }
    return list;  
    }
}