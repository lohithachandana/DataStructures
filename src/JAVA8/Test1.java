package JAVA8;

import java.lang.reflect.Array;
import java.util.*;



class W{

}
class X extends W{

}
public class Test1 {
   // static void append
    void method(int i,double j){
        System.out.println("int double");
    }
    void method(double i,int j){
        System.out.println("double,int");
    }
    void method(String S1,String S2){
        System.out.println("Syting String");
    }
   public static void main(String[] args){
String s="sachin"; s.concat("tendu");
       System.out.println(s);
       System.out.println(Thread.currentThread().getName());
       for(int i=1;i<5;i++){
           new Thread(){
               public void run(){
                   //System.out.println("running");
               }
           }.start();
       }
   }
}
