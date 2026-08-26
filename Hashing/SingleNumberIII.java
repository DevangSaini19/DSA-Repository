class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            }
            else {
            set.add(nums[i]);
            }
        }
        int arr[] = new int[set.size()];
        int index = 0;
        for(int c : set) {
            arr[index++] = c;
        }
        return arr;
    }
}