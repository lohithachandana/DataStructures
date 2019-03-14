package MediumQuestions;

import java.util.Stack;

public class NextLargestElement {

    static void findNGE(int[] arr){

        int n=arr.length,next,element;
        Stack<Integer> stack= new Stack();
        stack.push(arr[0]);

        for(int i=1;i<arr.length;i++){
            next=arr[i];
            if(!(stack.isEmpty())){
                element=stack.pop();
                while(element<next){
                    System.out.println(element+" --> "+next);
                    if(stack.isEmpty()){
                        break;
                    }
                    element=stack.pop();
                }
                if(element>next){
                    stack.push(element);
                }
            }
            stack.push(next);
        }

        while(!(stack.isEmpty())){
            element=stack.pop();
            next=-1;
            System.out.println(element+" --> "+next);
        }





        /*int[] out= new int[n];
        out[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){

                out[i]=arr[i+1];
            }else{
                if(arr[i]>out[i+1]){
                    out[i]=-1;
                }else{
                    out[i]=out[i+1];
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.println(arr[j]+" "+out[j]);
        }*/
    }

    public static void main(String[] args){
        int[] arr={12,11,32,14,23,56,2};
        findNGE(arr);
    }
}
