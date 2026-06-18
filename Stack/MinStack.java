class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int value) {
        stack1.push(value);
        if(stack2.isEmpty()) {
            stack2.push(value);
        }
        else if(value<=stack2.peek()) {
            stack2.push(value);
        }
    }
    
    public void pop() {
    int removed = stack1.pop();;
    if(removed==stack2.peek()) {
        stack2.pop();
       }
    }
    
    public int top() {
       return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}
