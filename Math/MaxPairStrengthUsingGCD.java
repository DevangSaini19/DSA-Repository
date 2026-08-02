class Solution {
    public long maxPairStrength(int[] nums) {
        long max = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                long g = gcd(nums[i], nums[j]);
                long n = (long) nums[i] * nums[j] / (g * g);
                if(n>max) {
                    max = n;
                }
            }
        }
        return max;
    }
    public long gcd(long a, long b) {
        while(b!=0) {
            long temp = b;
            b = a % b;
            a = temp;  
        }
        return a;
    }
}