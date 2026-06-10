package Hashing;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++) {
            if(map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }
            else {
                map.put(magazine.charAt(i),1);
            }
        }
        for(int j=0;j<ransomNote.length();j++) {
            char ch = ransomNote.charAt(j);
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            else {
                map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);
            }
            
        }
        return true;
    }
}
    

