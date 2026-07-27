class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++) {
            q.offer(nums[i]);
        }
        int n = q.poll() - 1;
        int m = q.poll() - 1;
        return m * n;
    }
}