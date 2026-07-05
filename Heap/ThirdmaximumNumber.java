class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++) {
            if(!q.contains(nums[i])) {
                q.offer(nums[i]);
            }
            if(q.size()>3) {
                q.poll();
            }
        }
        if(q.size()<3) {
            while(q.size()>1) {
                q.poll();
            }
        }
        return q.peek();
    }
}