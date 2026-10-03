class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b)-> {
            if (a.getValue() != b.getValue()) {
            return Integer.compare(a.getValue(), b.getValue());
            }
            else {
                return Integer.compare(b.getKey(), a.getKey());
            }
        });
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            q.offer(e);
        }
        int[] ans = new int[nums.length];
        int index = 0;
        while(!q.isEmpty()) {
            Map.Entry<Integer,Integer> a = q.poll();
            for(int i=0;i<a.getValue();i++) {
                ans[index++] = a.getKey();
            }
        }
        return ans;
    }
}