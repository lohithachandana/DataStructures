package stacks;

import java.util.Stack;

public class histogram {
    static Stack<Integer> S=new Stack<Integer>();
    static int i=0,maxArea=0,top;
    public static void getArea(Integer h[]){
       while(i < h.length){
           if(S.empty() || h[S.peek()]<=h[i]){
               S.push(i++);
           } else {
               top = S.peek();
               S.pop();
               int area = h[top]*(S.empty()?i:i-S.peek());

               if(area>maxArea){
                   maxArea=area;
               }
           }
       }

       while(S.empty() == false){
         /*  top = S.peek();
           int area=h[top]*(i-top);
           S.pop();*/
               top = S.peek();
           S.pop();
               int area = h[top]*(S.empty()?i:i-S.peek());

           if(area > maxArea){
               maxArea=area;
           }
       }
       System.out.println("area is "+maxArea);
    }
    public static void main(String[] args){
        Integer h[]={ 6, 2, 5, 4, 5, 2, 6};
        getArea(h);
    }
}
