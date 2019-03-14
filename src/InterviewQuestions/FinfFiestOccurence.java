package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FinfFiestOccurence {

    static char find(String s){
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(map.containsKey(curr)){
                int val=map.get(curr);
                map.put(curr,val+1);
            }else{
                map.put(curr,1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))>1){
                return s.charAt(i);
            }
        }
        return '0';
    }
    public static void main(String[] args){
       String s="IJJKI";
        System.out.println(find(s));
        ArrayList arr= new ArrayList<>();
       // Iterator
        //arr.add();

    }
}
