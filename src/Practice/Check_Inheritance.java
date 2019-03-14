package Practice;

import java.util.*;

class Ac{
    private void func1(){
        System.out.println("func1");
    }
}
class Bc extends Ac{
    public  void func1(){
        System.out.println("func2");
    }
}

public class Check_Inheritance {
    public static void main(String[] args){
        //int[] count= new int[N];
        Bc a=new Bc();
      //  a.func1();
        //List<Ac> list= new ArrayList<Bc>();
    }
}
