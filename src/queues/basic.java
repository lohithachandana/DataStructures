package queues;

import java.lang.reflect.Array;

public class basic {
    int a[];
    int front,rear;
    int size;

    basic() {
        a = new int[100];
        front = rear = -1;
        size = 0;
    }

    public boolean isFull() {
        if(rear == a.length-1){
            return true;
        }
        return false;
    }

    public int size() {
        size = rear - front + 1;
        return  size;
    }

    public boolean isEmpty() {
        return (rear == -1);
    }

    public int front(){
       if(!isEmpty()) {
            int last1 = a[front];
            return last1;
       }
       return front;
    }

    public void enqueue(int x){
        if(isEmpty()) {
            front=front+1;
            rear=rear+1;
            a[rear]=x;
        } else {
            if (!isFull()) {
                rear = rear + 1;
                a[rear] = x;
            } else {
                System.out.println("queue is full");
                return;
            }
        }
    }

    public int dequeue(){
       int last=-1;
       if(!isEmpty()){
           last=a[front];
           front=front+1;
       }
       return last;
    }
}
