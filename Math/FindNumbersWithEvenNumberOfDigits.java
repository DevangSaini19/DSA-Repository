class Solution {
    public int findNumbers(int[] nums) {
    int count = 0;
    for(int i=0;i<nums.length;i++) {
        int a = nums[i];
        int temp = 0;
        while(a>0) {
            int digit = a % 10;
            temp++;
            a = a/10;
        }
        if(temp%2==0) {
            count++;
        }
    }
    return count; 
    }
}