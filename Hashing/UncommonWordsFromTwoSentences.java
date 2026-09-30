class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String s = s1 +" " +  s2;
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        List<String> list = new ArrayList<>();
        int index = 0;
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            if(e.getValue()==1) {
                list.add(e.getKey());
            }
        }
        String[] ans = list.toArray(new String[0]);
        return ans;
    }
}