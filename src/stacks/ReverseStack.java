package stacks;

import java.util.Stack;

public class ReverseStack {
    static Stack st1=new Stack();
    static Stack st2=new Stack();
    public static void reverse(Stack input){
        System.out.println("input is "+input +"is empyty? "+input.empty());
        while (input.empty()!=true){
            st2.push(input.pop());
        }
        System.out.println("reversed stack is "+st2);
    }
    public static void main(String[] args){
        st1.push(5);
        st1.push(5);
        st1.push(7);
        st1.push(7);
        st1.push(9);
        st1.push(2);
        st1.push(0);
        st1.push(4);
        st1.push(6);
        st1.push(9);
        reverse(st1);


    }
}
