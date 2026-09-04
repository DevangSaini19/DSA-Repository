class Solution {
    public int xorOperation(int n, int start) {
        int arr[] = new int[n];
        int xor = 0;
        int index = 0;
        for(int i=0;i<n;i++) {
            arr[index++] = i;
        }
        for(int i=0;i<arr.length;i++) {
            xor = xor ^ (start + 2 * i);
        }
        return xor;
    }
}