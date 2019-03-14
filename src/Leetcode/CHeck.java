package Leetcode;

import java.util.*;

public class CHeck {
    public  void fun1(){
        Map<Integer,Integer> map=new Hashtable<>();
        map.put(1,5);
        map.put(4,6);
        map.put(4,5);
        System.out.println(map.entrySet().toString());
    }
}
