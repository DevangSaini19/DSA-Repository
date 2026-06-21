class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++) {
            String ch = tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                int top = st.pop();
                if(!st.isEmpty()) {
                    int t = st.pop();
                    if(ch.equals("+")) {
                        int sum = t+top;
                        st.push(sum);
                    }
                    if(ch.equals("-")) {
                        int subt = t-top;
                        st.push(subt);
                    }
                    if(ch.equals("*")) {
                        int multiply = t*top;
                        st.push(multiply);
                    }
                    if(ch.equals("/")) {
                        int division = t/top;
                        st.push(division);
                    }
                }
            }
            else {
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}