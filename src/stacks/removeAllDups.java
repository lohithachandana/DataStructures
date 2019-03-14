package stacks;
import java.util.Stack;
public class removeAllDups {
   static Stack stack=new Stack();
   static int temp;
   public static void remove(int in[] ){
       for(int i=0;i<in.length;i++){
           if(!(stack.isEmpty())){
               if(!(in[i]==(Integer)stack.peek())){
                   if(in[i]!=in[i-1]){
                      stack.push(in[i]);
                   }else
                      continue;
              }else
                  stack.pop();
           } else
               stack.push(in[i]);
       }
    System.out.println(stack+" is left in stack");
   }
    public static void main(String[] args){
      int a[]={1,9,6,8,8,8,0,1,1,0,6,5};
        remove(a);
    }
}
