package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyInLimitedArray {
    public List<Integer> frequencyCount(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=arr.length;i++) {
            map.put(i,0);
        }
        for(int j=0;j<arr.length;j++) {
            if(map.containsKey(arr[j])) {
                map.put(arr[j],map.get(arr[j])+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int w:map.values()) {
            list.add(w);
        }
        return list;
        
        
    }
}
 
    

