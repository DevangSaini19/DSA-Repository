class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=97;i<=122;i++) {
            if(map.containsKey(i)) {
                map.put((char)i,map.get(i)+1);
            }
            else {
                map.put((char)i,0);
            }
        }
        for(int i=0;i<sentence.length();i++) {
            char ch = sentence.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()) {
            if(e.getValue()==0) {
                return false;
            }
        }
        return true;
    }
}