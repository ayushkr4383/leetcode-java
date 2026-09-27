class MinStack {
    int min;
    int found=0;
    int head=-1;
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(stack1.isEmpty()==true){      
            head = head+1;
            stack1.push(value);
            min=value;
            stack2.push(min);
            found=1;
        }
        else{
            head = head+1;
            stack1.push(value);
            if(value<min){
                min=value;
            }
            stack2.push(min);
        }
    }
    
    public void pop() {
        if(stack1.isEmpty()==false){
            stack1.pop();
            stack2.pop();
            head = head-1;
           
        }
        if(stack2.isEmpty()==false){
            min=stack2.peek();
        }
        
        
    }
    
    public int top() {
        if(stack1.isEmpty()==false){
            return stack1.peek();
        }
       else{
        return -1;
       }
        
    }
    
    public int getMin() {
        if(stack2.isEmpty()==false){
            return stack2.peek();
        }
        else{
            return -1;
        }
       
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */