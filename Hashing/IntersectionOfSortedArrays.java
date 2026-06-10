package Hashing;

import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
       
        for (int i=0;i<nums1.length;i++) {
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++) {
            if(set1.contains(nums2[j])) {
            set2.add(nums2[j]);
            }    
        }
        int[] arr = new int[set2.size()];
            int w = 0;
            for(int i : set2) {
                arr[w++] = i; 
            }
        return arr;
        
    }
}
