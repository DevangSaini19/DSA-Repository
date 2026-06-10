class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int l = 0;
        int r = k-1;
        int sum=0;
       for(int i=0;i<=r;i++) {
            sum = sum + arr[i];
       }
       int currentsum = sum;
        int maxsum = sum;
        while(r<arr.length-1) {
            currentsum  = currentsum - arr[l] + arr[r + 1];
            l++;
            r++;
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
        
    }
}
