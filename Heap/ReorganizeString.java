class Solution {
    class Pair {
        char ch;
        int freq;
        public Pair(char ch,int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }
    public String reorganizeString(String s) {
       PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->b.freq - a.freq);
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()) {
            Pair p = new Pair(e.getKey(),e.getValue());
            q.offer(p);
        }
        Pair prev = null;
        StringBuilder ans = new StringBuilder();
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            ans.append(curr.ch);
            curr.freq--;
            if(prev!=null && prev.freq>0) {
                q.offer(prev);
            }
            prev = curr;
        }
        if(prev!=null && prev.freq>0) {
            return "";
        }
        return ans.toString();

    }
}