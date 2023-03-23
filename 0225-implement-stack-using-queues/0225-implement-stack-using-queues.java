class MyStack {

    private Queue<Integer> main;
    private Queue<Integer> temp;
    
    public MyStack() {
        main = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x) {
        if (this.main.isEmpty()) {
            this.main.offer(x);
        } else {
            this.temp.offer(x);
            this.temp.addAll(main);
            this.main.clear();
            this.main.addAll(temp);
            this.temp.clear();
        }
    }
    
    public int pop() {
        return this.main.poll();
    }
    
    public int top() {
        return this.main.peek();
    }
    
    public boolean empty() {
        return this.main.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */