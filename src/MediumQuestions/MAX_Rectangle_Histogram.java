package MediumQuestions;

import java.util.Stack;

public class MAX_Rectangle_Histogram {
    static int getMaxArea(int[] h){
        int i=0,max=0;
        Stack<Integer> stack = new Stack<>();

        while (i<h.length){

            if(stack.isEmpty() || h[i]>=h[stack.peek()]){
                stack.push(i);
                i++;
            }else{
                int l = h[stack.pop()];
                int b = stack.isEmpty()?i:i-stack.peek()-1;
                max=Math.max(max,l*b);
            }
        }
        while(!stack.isEmpty()){
            int l = h[stack.pop()];
            int b = stack.isEmpty()?i:i-stack.peek()-1;
            max=Math.max(max,l*b);
        }

        return max;
    }

    public static void main(String[] args){
       // int[] h={2,1,5,6,3,2};
        int[] h={6,2,5,4,5,1,6};
        System.out.println(getMaxArea(h));

    }
}
