class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<word.length();i++) {
            for(int j=i+1;j<=word.length();j++) {
            map.put(word.substring(i,j),1);
            }
        }
        for(String s : patterns) {
            if(map.containsKey(s)) {
                count++;
            }
        }
        return count;
        
    }
}