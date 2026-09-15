class Solution {
    public static int largest(int[] arr) {
        int ans = arr[0];
      for(int i=0;i<arr.length;i++) {
          if(arr[i]>ans) {
              ans = arr[i];
          }
      }
      return ans;   
    }
}
