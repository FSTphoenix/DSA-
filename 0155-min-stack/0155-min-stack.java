class MinStack {
    Stack<Integer> s;
    Stack<Integer> s1;
    public MinStack() {
        s=new Stack<>();
        s1=new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
        if(s1.isEmpty() || x<=s1.peek()){
            s1.push(x);
        }
    }
    
    public void pop() {
        if(!s.isEmpty()){
            int rev=s.pop();
            if(rev==s1.peek()){
                s1.pop();
            }
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return s1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */