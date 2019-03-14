package stacks;

import java.lang.reflect.Array;
import java.util.Stack;

public class IntoPost {
    static IntoPost s=new IntoPost();
    static String out="";
    static String input;
    static int top=-1;
    int max=18;
    char a[]=new char[max];
    public void push(char j){
        top=top+1;
        a[top]=j;
    }
    public char pop(){
        char b=a[top];
        top=top-1;
        return b;
    }

    public char top(){
        return a[top];
    }

    public static boolean isEmpty(){
        return (top<0);
    }

    public static void checkStack(char curr,int prec){

        if(top >= 0){
            int precIn;
            System.out.println("curr is "+curr+" "+"prec is "+prec);
            char lastV= s.top();
            System.out.println("lastV is "+lastV);

            if(lastV=='*' || lastV=='/'){
                precIn=2;
            } else {
                precIn = 1;
            }

            if(precIn>prec) {
                System.out.println(precIn +" > "+prec);
                System.out.println("top value initially "+top+" top value is "+s.top());

                while(top!=-1) {
                    out = out + s.pop();
                }

                s.push(curr);

            } else if(prec==precIn){
                out=out+s.pop();
                s.push(curr);
            }
             else {
                System.out.println( " push curr "+curr);
                s.push(curr);
            }
        } else {
            System.out.println("push when stack is empty "+curr);
            s.push(curr);
        }

    }
    public static void convert(String in){
            input=in;
             int i;
            for(i=0;i<in.length();i++){
                char e=in.charAt(i);
                if(e=='+' || e=='-'){
                    checkStack(e,1);
                }else if(e=='*'||e=='/'){
                    checkStack(e,2);
                }else{
                    out=out+e;
                }
            }
            //String ends, add the rest in stack to the output
            if (top>=0){
                out=out+s.pop();
            }
             //when the string ends
             if(i==in.length()){
                while(top!=-1) {
                    out = out +s.pop() ;
                }
            }

             System.out.println(out);
    }
    public static void main(String[] args){
          // convert("1+2*4/5-7+3/6");
        convert("3*5+2-6");
        }
    }
