class MyCircularQueue {
    int[] queue;
    int front, rear, max, count;
    public MyCircularQueue(int k) {
        queue = new int[k];
        max=k;
        front=0;
        rear=0;
        count=0;
    }
    
    public boolean enQueue(int value) {
        if(count<max){
            queue[rear] = value;
            rear = (rear+1)%max;
            count++;
            return true;
        }
        else return false;
        
    }
    
    public boolean deQueue() {
        if(count==0) return false;
        
        else{
            front = (front+1)%max;
            count--;
            return true;
        }
    }
    
    public int Front() {
        if(count==0) return -1;
        else return queue[front];
    }
    
    public int Rear() {
        if(count==0) return -1;
        else{
            if(rear==0) return queue[max-1];
            else return queue[rear-1];
        }
    }
    
    public boolean isEmpty() {
        if(count==0) return true;
        else return false;
    }
    
    public boolean isFull() {
        if(count==max) return true;
        else return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */