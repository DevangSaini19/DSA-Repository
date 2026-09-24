class Solution {
    public int countSpecialIntegers(int[] nums) {
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>(); 
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int count = 0;
        for(int x : map.keySet()) {
            ArrayList<Integer> list = map.get(x);
            if(list.size()<3) {
                continue;
            }
            int diff = list.get(1) - list.get(0);
            boolean special = true;
            for(int i=2;i<list.size();i++) {
                if(list.get(i) - list.get(i-1)!= diff) {
                    special = false;
                    break;
                }
            }
            if(special) {
                count++;
            }
        }
        return count;
    }
}