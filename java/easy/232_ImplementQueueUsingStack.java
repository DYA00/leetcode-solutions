//Solution for the problem, Implement Queue Using Stacks in the leetcode.
class MyQueue {
    private Stack<Integer> origin;
    private Stack<Integer> cleaner;

    public MyQueue() {
        origin = new Stack<>();
        cleaner = new Stack<>();
    }
    
    public void push(int x) {
        origin.push(x);
    }
    
    public int pop() {
        while(origin.size() > 1) {
            cleaner.push(origin.pop());
        }
        int first = origin.pop();
        while(cleaner.size() >= 1) {
            origin.push(cleaner.pop());
        }
        return first;
    }
    
    public int peek() {
        while(origin.size() > 1) {
            cleaner.push(origin.pop());
        }
        int first = origin.peek();
        while(cleaner.size() >= 1) {
            origin.push(cleaner.pop());
        }
        return first;
    }
    
    public boolean empty() {
        return origin.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
