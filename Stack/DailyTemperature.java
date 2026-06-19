class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--) {
            int curr = temperatures[i];
            while(!st.isEmpty() && temperatures[st.peek()] <= curr){
                st.pop();
            }
            if(st.isEmpty()) {
                arr[i] = 0;
            }
            else {
                arr[i] = st.peek() - i;
            }
            st.push(i);
        }
        return arr;
    }
}