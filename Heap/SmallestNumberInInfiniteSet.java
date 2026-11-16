class SmallestInfiniteSet {
    PriorityQueue<Integer> q; 
    public SmallestInfiniteSet() {
        q = new PriorityQueue<>();
        for(int i=1;i<1001;i++) {
            q.offer(i);
        }
    }
    
    public int popSmallest() {
        return q.poll();
    }
    
    public void addBack(int num) {
        if(!q.contains(num)) {
        q.offer(num);
        }
    }
}
