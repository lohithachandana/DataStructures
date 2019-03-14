package stacks;

import java.util.ArrayList;

public class MStack {
    public static ArrayList<Integer> arr=new ArrayList<Integer>();

    public static int top;
    public static int index;

    MStack() {
        //top=-1;
        int index=-1;
    }
    public static boolean isEmpty(){
        if(index<0){
            return true;
        }
        return false;
    }
    public static void push(int val) {
         arr.add(val);
         top=val ;}

    public static int pop() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return index;
        }
        int index=arr.size()-1;
        int curr=arr.get(index);
        arr.remove(index);
        return curr;

    }
}
