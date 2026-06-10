package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public int missingNumber(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<=nums.length;i++) {
        map.put(i,0);
       }
       for(int j=0;j<nums.length;j++) {
         if(map.containsKey(nums[j])) {
            map.put(nums[j],map.get(nums[j])+1);
         }
         else {
            map.put(nums[j],1);
         }
       }
       for(Map.Entry<Integer,Integer> e:map.entrySet()) {
        if(e.getValue()==0) {
            return e.getKey();
        }

    }
    return -1;
 }
} 
    

