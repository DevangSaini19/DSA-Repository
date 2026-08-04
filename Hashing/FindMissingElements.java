class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>max) {
                max = nums[i];
            }
            if(nums[i]<min) {
                min = nums[i];
            }
        }
        for(int i=min;i<=max;i++) {
            map.put(i,1);
        }
        for(int j=0;j<nums.length;j++) {
            if(map.containsKey(nums[j])) {
                map.put(nums[j],map.get(nums[j])-1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue()==1) {
                list.add(e.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}