class Solution {
    public int minDeletions(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int curr = 0;
        int count = 0;
        for(int i=1;i<nums.length;i++) {
                if(nums[curr]!=nums[i]) {
                    list.add(nums[i]);
                }
                else {
                    count++;
                }
                curr++;
        }
        return count;
    }
}