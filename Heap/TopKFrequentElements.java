class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    PriorityQueue<Map.Entry<Integer,Integer>> q =new         PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
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
            if(q.size()>k) {
            q.poll();
        }
    }
        int arr[] = new int[k];
        int index = 0;
        while(q.size()!=0) {
            Map.Entry<Integer, Integer> e = q.poll();
            arr[index++] = e.getKey();
        }
        return arr;
    }
}