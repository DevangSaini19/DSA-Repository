class Solution {
    public int largestRectangleArea(int[] heights) {
        int prevSmaller[] = new int[heights.length];
        int nextSmaller[] = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<heights.length;i++) {
            int curr = heights[i];
            while(!st.isEmpty() && heights[st.peek()]>=curr) {
                st.pop();
            }
            if(st.isEmpty()) {
                prevSmaller[i] = -1;
            }
            else {
                prevSmaller[i] = st.peek();
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            st.pop();
        }
        for(int i=heights.length-1;i>=0;i--) {
            int curr = heights[i];
            while(!st.isEmpty() && heights[st.peek()]>=curr) {
                st.pop();
            }
            if(st.isEmpty()) {
                nextSmaller[i] = heights.length;
            }
            else {
                nextSmaller[i] = st.peek();
            }
            st.push(i);
        }
        int Maxarea = 0;
        for(int i=0;i<heights.length;i++){
            int width = nextSmaller[i] - prevSmaller[i] - 1;
            int area = heights[i] * width;
            Maxarea = Math.max(Maxarea,area);
        }
        return Maxarea;
    }
}