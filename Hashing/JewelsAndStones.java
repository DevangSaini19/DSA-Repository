class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<jewels.length();i++) {
            if(map.containsKey(jewels.charAt(i))) {
                map.put(jewels.charAt(i),map.get(jewels.charAt(i))+1);
            }
            else {
                map.put(jewels.charAt(i),1);
            }
        }
        for(int i=0;i<stones.length();i++) {
            if(map.containsKey(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}