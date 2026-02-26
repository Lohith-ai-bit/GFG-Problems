class myStack {
    int[] arr;
        int top;
        int capacity;

    public myStack(int n) {
        capacity=n;
        arr= new int[n];
        top=-1;
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        return top==capacity-1;
        // check if the stack is full
    }

    public void push(int x) {
        if(!isFull()){
            arr[++top]=x;
        }
        // Inserts x at the top of the stack
    }

    public void pop() {
        if(!isEmpty()){
            top--;
        }
        // Removes an element from the top of the stack
    }

    public int peek() {
        if(isEmpty()) return -1;
            return arr[top];
        // Returns the top element of the stack
    }
}