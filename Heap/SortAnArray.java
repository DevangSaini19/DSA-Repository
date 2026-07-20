class Solution {
    public int[] sortArray(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++) {
            q.offer(nums[i]);
        }
        while(!q.isEmpty()) {
            int p = q.poll();
            ans[index++] = p;
        }
        return ans;
    }
}
