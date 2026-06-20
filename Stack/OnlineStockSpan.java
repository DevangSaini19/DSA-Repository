class StockSpanner {
    class Pair {
    int price;
    int span;
    }
    Stack<Pair> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int s = 1;
        while(!st.isEmpty() && st.peek().price<=price) {
        Pair p = st.pop();
        s += p.span;
        }
        Pair p = new Pair();
        p.price = price;
        p.span = s;
        st.push(p);
        return s;
    }
}
