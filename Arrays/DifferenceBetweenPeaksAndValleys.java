class Solution {
    public int peakValleyDifference(int[] nums) {
        ArrayList<Integer> peak = new ArrayList<>();
        ArrayList<Integer> valley = new ArrayList<>();
        for(int i=1;i<nums.length-1;i++) {
            if(i>0 && nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
                peak.add(nums[i]);
            }
            if(i>0 && nums[i]<nums[i-1] && nums[i]<nums[i+1]) {
                valley.add(nums[i]);
            }  
        }
        int sum = 0;
        int sum1 = 0;
        for(int i =0;i<peak.size();i++) {
            sum+=peak.get(i);
        }
        for(int i =0;i<valley.size();i++) {
            sum1+=valley.get(i);
        }
        int ans = sum - sum1;
        return ans;
    }
}