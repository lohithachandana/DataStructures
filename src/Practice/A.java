package Practice;

import java.util.ArrayList;

abstract class B {
   abstract  void foo();
}
class C1 extends  B{
    public void foo(){

    }
     void C1(){
         System.out.println("C1");
    }
}

public class A extends B {

    void foo(){
        System.out.println("jhsgf");
    }
    void foo(int x){
        System.out.println(x);
    }
    A(){
        super();

    }
    public void A(){
        // super();

        System.out.println("A");

    }
    public static void main(String[] args){
       // this.A();
       // new B().foo();
        new A().A();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i:list){
            if(i==3)
             System.out.println(i+"prints Integer");
            else
                System.out.println("it WORKS ASSHOLE");
        }

       // this.A();
        String A="Lohitha";
        String B="Sanath";
        if(A.length()>B.length()){
            B=B+" ";
        }
        //int a1=A.length();int b=B.length();
        A=A+B;
        B=B+A;
        A= A.substring(A.length()/2);
        B=B.substring(A.length(),A.length()*2);
        System.out.println(A);
        System.out.println(B);
    }
    //LinkedList ll= new ArrayList();
}

