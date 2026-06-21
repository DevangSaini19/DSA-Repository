class Solution {
    public int maximalRectangle(char[][] matrix) {
        int height[] = new int[matrix[0].length];
        int Max = 0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]=='1') {
                    height[j] += 1;
                }
                else {
                    height[j] = 0;
                }
            }
            int area =largestRectangleArea(height);
            Max = Math.max(Max,area);
        }
        return Max;        
    }
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