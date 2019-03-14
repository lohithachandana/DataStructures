package queues;

import java.util.Stack;

public class Reversek {

    public static void reverek(basic in,int k){
        Stack temp=new Stack();
        for(int i=0;i<k;i++){
            temp.push(in.dequeue());
        }

        while(!temp.isEmpty()) {
            in.enqueue((Integer) temp.pop());
        }

        for(int i =0; i < in.size()-k; i++) {
            in.enqueue(in.dequeue());
        }
    }
    public static void main(String[] args){
        basic in=new basic();
        in.enqueue(10);
        in.enqueue(20);
        in.enqueue(30);
        in.enqueue(40);
        in.enqueue(50);
        in.enqueue(60);
        in.enqueue(70);
        in.enqueue(80);
        in.enqueue(90);
        reverek(in,4);
        for(int i=in.front;i<=in.rear;i++){
            System.out.println(in.a[i]);
        }
    }
}
