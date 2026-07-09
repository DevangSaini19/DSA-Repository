class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
                map.put(ch,i);  
        }
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
        int lastOccurence = map.get(c);
        end = Math.max(end,lastOccurence); 
        if(i==end) {
            list.add(end - start + 1);
            start = end + 1;
        } 
        }
        return list;

    }
}