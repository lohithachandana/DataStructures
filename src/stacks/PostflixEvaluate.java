package stacks;
import java.util.*;

public class PostflixEvaluate {
    public static void evaluate(String input){

        Stack<Integer> st=new Stack();

        for(int i=0;i<input.length();i++){
            char in = input.charAt(i);
            if(in == '*' || in == '+'){
                int op1 =  st.pop();
                int op2 = st.pop();
                int value = 0;
                if (in == '*') {
                    value = op1 * op2;
                }
                if (in == '+') {
                    value = op1 + op2;
                }
                st.push(value);
            } else{
                st.push(Integer.parseInt(Character.toString(in)));
            }

        }

        System.out.println(st.pop());
    }
    public static void main(String[] args){
        evaluate("53*24*+");

    }
}
