class myQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    void dequeue() {
        transfer();
        s2.pop();
    }

    int front() {
        transfer();
        if(s2.isEmpty()){
            return -1;
        }
        return s2.peek();
    }

    int size() {
        return s1.size()+s2.size();
    }
    private void transfer(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }
}
