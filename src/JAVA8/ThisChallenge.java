package JAVA8;

import java.util.ArrayList;
import java.util.Iterator;




public class ThisChallenge {

    static Iterator func(ArrayList list){
        Iterator it=list.iterator();
        while(it.hasNext()){
            Object obj= it.next();
            if(obj.toString().equals("###")){
                break;
            }
        }
        return it;
    }
    public static void main(String[] arhs){
        ArrayList list= new ArrayList();
        list.add(42);
        list.add("###");
        list.add("Hello");
        Iterator it= func(list);
        while(it.hasNext()){
            Object obj= it.next();
            System.out.println(obj.toString());
        }

        int x=9;
        String s= Integer.toString(x);


    }
}
