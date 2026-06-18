class MyStack {
    Queue<Integer> q1;
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
        int i = q1.size();
        while(i>1) {
            int removed = q1.poll();
            q1.offer(removed);
            i--;
        }     
    }
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()) {
            return true;
        }
        return false;
    }
}