class KthLargest {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i=0;i<nums.length;i++) {
            q.offer(nums[i]);
            if(q.size()>k) {
                q.poll();
            }
        }
    //     if(q.size()>k) {
    //     while(q.size()!=k) {
    //         q.poll();
    //     }
    //   }

    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size()>k) {
            q.poll();
        }
        return q.peek();
    }
}