package Perfios.Submission;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthisis {
    public static void main(String []argh)
    {
        Stack s= new Stack();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='{' || input.charAt(i)=='(' || input.charAt(i)=='['){
                    s.push(input);
                }else{
                    if(!s.empty()){
                        s.pop();
                    }else{
                        s.push(input);
                        break;
                    }
                }
            }

            if(s.empty()){
                System.out.println("true");
            }else{

                System.out.println("false");
            }
            s.clear();

        }




    }
}
