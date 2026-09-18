class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
    String[] ans = new String[names.length];
    PriorityQueue<Integer> q =new PriorityQueue<>((a,b) -> Integer.compare(heights[b],heights[a]));
    for(int i=0;i<names.length;i++) {
        q.offer(i);
    }
    int index = 0;
    while(!q.isEmpty()) {
        int temp = q.poll();
        ans[index++] = names[temp];
    }
    return ans; 
    }
}