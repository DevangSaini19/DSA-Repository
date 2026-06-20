class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[nums.length];
        int index = 0;
        int n = nums.length;
        for(int i=2*n-1;i>=0 ;i--) {
            int curr = nums[i%n];
            while(!st.isEmpty() && st.peek()<=curr) {
                st.pop();
            }
            if(st.isEmpty()) {
                arr[i%n] = -1;
            }
            else {
                arr[i%n] = st.peek();
            }
            st.push(curr);
        }
        return arr;
    }
}