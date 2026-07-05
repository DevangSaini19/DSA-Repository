class Solution {
    public List<String> topKFrequent(String[] words, int k) {
    HashMap<String, Integer> map = new HashMap<>();
    PriorityQueue<String> q = new PriorityQueue<>((a,b)-> {
        if(map.get(a).equals(map.get(b))){
            return b.compareTo(a);
        }
        return map.get(a) - map.get(b);
    });
    for(int i=0;i<words.length;i++) {
            if(map.containsKey(words[i])) {
                map.put(words[i],map.get(words[i])+1);
            }
            else {
                map.put(words[i],1);
            }
        }

    for(String w : map.keySet()) {
        q.offer(w);
        if(q.size()>k) {
            q.poll();
        }
    }
    List<String> list = new ArrayList<>(k);
    while(!q.isEmpty()) {
        String word = q.poll();
        list.add(0,word);
    }
    return list;

    }
}