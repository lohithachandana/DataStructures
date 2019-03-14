package stacks;

import java.util.Stack;

public class palindrome {
    static Stack<String> in=new Stack<String>();
    static Stack<String> tmp=new Stack<String>();
    public static boolean check(Stack<String> inp) {
        int index = inp.size() - 1;
        while (inp.elementAt(index) != "X") {
            //System.out.println("entered loop");
            tmp.push(inp.pop());
            index--;
        }
        inp.pop();
        System.out.println(inp + " input");
        System.out.println(tmp + " temp");

        //System.out.print(inp.isEmpty());
        while (!(inp.isEmpty()) && !(tmp.isEmpty())) {
            if (inp.peek() == tmp.peek()) {
                inp.pop();
                tmp.pop();
            } else {
                return false;
            }
        }
        if (inp.isEmpty() && tmp.isEmpty()) {
            return true;
        }else
            return false;

    }

    public static void main(String[] args){
        in.push("b");
        in.push("a");
        in.push("b");
        in.push("b");
        in.push("X");
        in.push("b");
        in.push("b");
        in.push("a");
        in.push("b");
        //System.out.print(in.indexOf("X"));
        if(check(in)==true){
            System.out.print("palindrome");
        }else
            System.out.print("Not a palindrome");


    }
}
