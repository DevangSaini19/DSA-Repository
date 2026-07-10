class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = FirstOccurence(nums,target);
        int r = LastOccurence(nums,target);
        return new int[]{s,r};
    }
    public int FirstOccurence(int nums[],int target){
        int first = 0;
        int last = nums.length-1;
        int a = -1;
        while(first<=last) {
            int mid = first+(last-first)/2;
            if(nums[mid]==target) {
            a = mid;
            last = mid-1;
            }
            else if(nums[mid]<target) {
                first = mid+1;
            }
            else {
                last = mid-1;
            }
        }
        return a;
    }
    public int LastOccurence(int nums[],int target){
        int first = 0;
        int last = nums.length-1;
        int b = -1;
        while(first<=last) {
            int mid = first+(last-first)/2;
            if(nums[mid]==target) {
            b = mid;
            first = mid+1;
            }
            else if(nums[mid]<target) {
                first = mid+1;
            }
            else {
                last = mid-1;
            }
        }
        return b;
    }
}