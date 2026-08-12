class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++) {
            q.offer(nums[i]);
        }
        int i = 0;
        while(!q.isEmpty()) {
        int n = q.poll();
        int p = q.poll();
        nums[i++] = p;
        nums[i++] = n;
        }
        return nums;
        
    }
}