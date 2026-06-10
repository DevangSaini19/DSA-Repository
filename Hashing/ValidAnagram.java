package Hashing;
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> map = new HashMap<>();
       HashMap<Character,Integer> map1 = new HashMap<>();
       for(int i=0;i<s.length();i++) {
        if(map.containsKey(s.charAt(i))) {
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        else{
        map.put(s.charAt(i),1);
        }
       }
        for(int i=0;i<t.length();i++) {
        if(map1.containsKey(t.charAt(i))) {
            map1.put(t.charAt(i),map1.get(t.charAt(i))+1);
        }
        else {
        map1.put(t.charAt(i),1);
        }
       }
       if(map.equals(map1)) {
        return true;
       }
       return false; 
    }
}