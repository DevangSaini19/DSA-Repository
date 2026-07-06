class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> q = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(Map.Entry<Character,Integer> e : map.entrySet()) {
            q.offer(e);
        }
        while(!q.isEmpty()) {
        Map.Entry<Character,Integer> e = q.poll();
        for(int i=0;i<e.getValue();i++) {
            ans.append(e.getKey());
        }
    }
    return ans.toString();
    }
}