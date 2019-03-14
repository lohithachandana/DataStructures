package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class CharacterArray {
    static char[] check(char[] in) {
        Stack s=new Stack();
        for(int i=0;i<in.length;i++){
                if(in[i]=='<'){
                   s.pop();
                }else{
                    s.push(in[i]);
                }
        }
        char[] newOut= new char[s.size()];
        int i=0;
        while (!s.empty()){
            newOut[i]=(Character) s.pop();
            i++;
        }
        return newOut;
    }
    static boolean compare(char[] A,char[] B){

       char[] A1= check(A);
       char[] B1= check(B);
        return Arrays.equals(A1,B1);
    }
    public static void main(String[] args){
        char A[] = {'1','2','3','<','<','<','4','<','5'};
        char B[] = {'1','2','<','8','<','<','5','5','<'};
        //char[] A={'1','2','3','<','4','<'};
        //char[] B={'1','2'};
        System.out.println("are given arrays same? "+compare(A,B));
    }
}
