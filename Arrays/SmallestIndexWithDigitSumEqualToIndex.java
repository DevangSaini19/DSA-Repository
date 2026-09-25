class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for(int i=0;i<nums.length;i++) {
            int sum = 0;
            int j = nums[i];
            while(j>0) {
                int digit = j % 10;
                sum+=digit;
                j = j/10;
            }
            if(sum==i) {
                temp = i;
                min = Math.min(min,temp);
            }
        }
        if(min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}