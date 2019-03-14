package Practice;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthisis {
    public static void main(String []argh)
    {
        Stack s= new Stack();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //System.out.println("entered is "+input);
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
                //System.out.println("Its empty");
                System.out.println("true");
            }else{
                //System.out.println("its not");
                System.out.println("false");
            }
            s.clear();
            //Complete the code
        }
        //System.out.println("");



    }
}
