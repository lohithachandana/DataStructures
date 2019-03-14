package Practice;

import java.util.Hashtable;
import java.util.*;
import java.util.TreeMap;
class A1{
    static int g;
}
class B1 extends A1{
    A1 obj= new A1();

}

public class Hash {

    public static void main(String[] args){
        Map<Integer,Integer> map=new TreeMap<>();
        Set set= new HashSet<Integer>();
        map.put(1,5);
        map.put(4,3);
        map.put(5,3);
        System.out.println(map.entrySet().toString());

    }
}
