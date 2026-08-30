class Solution {
    public int countSpecialIntegers(int[] nums) {
    HashSet<Integer> special = new HashSet<>();
    HashSet<Integer> notSpecial = new HashSet<>();
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(i==0 || nums[i]!=nums[i-1]) {
            if(special.contains(nums[i])) {
                notSpecial.add(nums[i]);
            }
            else {
                special.add(nums[i]);
            }
        }
    }
    for(int s : special) {
        if(!notSpecial.contains(s)) {
            count++;
        }
    }
    return count;    
    }
}