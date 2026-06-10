package Hashing;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        int arr[] = new int[k];
        int index = 0;
        for(int t = 0; t < k; t++) {
         int maxFreq = 0;
         int maxKey = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
         if(entry.getValue() > maxFreq) {
            maxFreq = entry.getValue();
            maxKey = entry.getKey();
           }
         }
         arr[index++] = maxKey;
         map.remove(maxKey);
       }
       return arr;
    }
} 
    

