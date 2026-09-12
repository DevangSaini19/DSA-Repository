class Solution { // Using HashMap
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue()==1) {
                sum+=e.getKey();
            }
        }
        return sum;
    }
}


// class Solution {  // Using HashSet
//     public int sumOfUnique(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         HashSet<Integer> set1 = new HashSet<>();
//         int sum = 0;
//         for(int i=0;i<nums.length;i++) {
//             if(set1.contains(nums[i])) {
//                 continue;
//             }
//             if(set.contains(nums[i])) {
//                 set1.add(nums[i]);
//                 set.remove(nums[i]);
//             }
//             else {
//                 set.add(nums[i]);
//             }
//         }
//         if(set.isEmpty()) {
//             return 0;
//         }
//         for(int n : set) {
//             sum += n;
//         }
//         return sum;
//     }
// }