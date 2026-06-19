class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--) {
            int curr = nums2[i];
            while(!st.isEmpty() && st.peek()<=curr) {
                st.pop();
            }
            if(st.isEmpty()) {
            map.put(curr,-1);
            }
            else {
                map.put(curr,st.peek());
            }
            st.push(curr);
        }
        int arr[] = new int[nums1.length];
        int index = 0;
        for(int j : nums1) {
        arr[index++] = map.get(j);
        }
        return arr;

    }
}