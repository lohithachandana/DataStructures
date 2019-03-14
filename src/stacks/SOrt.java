/*
package stacks;


import java.util.Stack;

public class SOrt {
    static int tbp;
    static void sort(Stack<Integer> in){
        Stack<Integer> secStack=new Stack<Integer>();
        while (!in.isEmpty()) {
            int firPeek =in.peek();

            if(secStack.isEmpty()){
                secStack.push(firPeek);
                in.pop();
            } else {
                int secPeek = secStack.peek();

                if (firPeek < secPeek) {
                    secStack.push(in.pop());
                } else {
                    int temp = in.pop();
                    in.push(secStack.pop());
                    in.push(temp);
                }
            }
        }
        System.out.println("final is " + secStack);
    }

    public static void main(String[] args){
        Stack<Integer> s= new Stack<Integer>();
        s.push(3);
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        sort(s);
    }
}
*/
