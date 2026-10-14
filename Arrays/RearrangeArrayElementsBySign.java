class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                pos.add(nums[i]);
            }
            if(nums[i]<0) {
            neg.add(nums[i]);
            }
        }
        int[] ans = new int[nums.length];
        int index = 0;
        for(int i=0;i<Math.max(pos.size(),neg.size());i++) {
            if(i<pos.size()) {
                ans[index++] = pos.get(i);
            }
            if(i<neg.size()) {
            ans[index++] = neg.get(i);
            }
        }
        return ans;
    }
}