class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int index = 0;
        for(int i=0;i<m;i++) {
            q.offer(nums1[i]);
        }
        for(int i=0;i<n;i++) {
            q.offer(nums2[i]);
        
        }
        while(!q.isEmpty()) {
            nums1[index++] = q.poll();
        }
    }
}