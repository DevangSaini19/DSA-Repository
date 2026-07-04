class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++) {
            pq.offer(stones[i]);
        }
        while(!pq.isEmpty() && pq.size()!=1) {
            int p = pq.poll();
            if(!pq.isEmpty()) {
                int q = pq.poll();
                if(p!=q) {
                    pq.offer(p-q);
                }
            }
        }
        if(!pq.isEmpty()) {
        return pq.poll();
        }
        return 0;

    }
}