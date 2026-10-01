class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue().equals(e.getKey())) {
                ans = Math.max(e.getKey(),ans);
            }
        }
        return ans; 
    }
}