package stacks;


import java.util.Stack;


public class SortByStack {
    static void sort(Stack<Integer> in){
        Stack<Integer> tmp=new Stack<Integer>();

        while (!in.isEmpty()) {
            int temp=in.peek();

            if(!tmp.isEmpty()) {

                if (temp < tmp.peek()) {
                    int putback = tmp.pop();
                    tmp.push(temp);
                    in.pop();
                    tmp.push(putback);
                } else {
                    tmp.push(temp);
                    in.pop();
                }
            } else {
                tmp.push(temp);
                in.pop();
            }
        }
        System.out.println("final is " + tmp);
    }

    public static void main(String[] args){
        Stack<Integer> s= new Stack<Integer>();
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);
        s.push(5);
        sort(s);
    }
}
