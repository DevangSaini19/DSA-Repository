class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++) {
        String a = operations[i];
        if(!a.equals("+") && !a.equals("D") && !a.equals("C")) {
            st.push(Integer.parseInt(a));
        }
        else if(a.equals("+") && !st.isEmpty()) {
        int t2 = st.pop();
        if(!st.isEmpty()) {
        int t1 = st.pop();
        int sum = t2+t1;
        st.push(t1);
        st.push(t2);
        st.push(sum);
        }
        }
        else if(a.equals("C") && !st.isEmpty()) {
            st.pop();
        }
        else if(a.equals("D") ) {
            st.push(2*st.peek());
        }
        }
        int sum = 0;
        while(!st.isEmpty()) {
            sum+=st.pop();
        }
        return sum;

    }
}