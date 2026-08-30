class Solution {
    public int minimumDeletions(int[] nums) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int max = nums[0];
        int min = nums[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        int leftIndex = Math.min(minIndex, maxIndex);
        int rightIndex = Math.max(minIndex, maxIndex);
        count = rightIndex + 1;
        count1 = nums.length - leftIndex;
        count2 = Math.min((leftIndex + 1) + (nums.length - rightIndex),(rightIndex + 1) +(nums.length - leftIndex));
        int temp = Math.min(count, count1);
        int ans = Math.min(temp, count2);
        return ans;
    }
}