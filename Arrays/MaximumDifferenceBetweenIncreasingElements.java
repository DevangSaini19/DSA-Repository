class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            int ans = 0;
            for(int j=i+1;j<nums.length;j++) {
                if(i<j && nums[i]<nums[j]) {
                    ans = Math.abs(nums[i]-nums[j]);
                    max = Math.max(max,ans);
                }
            } 
        }
        if(max==0) {
            return -1;
        }
        return max;
    }
}