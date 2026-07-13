class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums);
        int rank = 1;
        for(int j=0;j<nums.length;j++) {
            if(!map.containsKey(nums[j])) {
            map.put(nums[j],rank++);
            }
        }
        for(int i=0;i<arr.length;i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}