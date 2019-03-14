package JAVA8;

interface Doable {
    void doIt(String z);
}

interface Sayable extends Doable{
    void say();
    default  void check(){
        System.out.println("super emthod");
    }
}


/*interface Doable extends Sayable {
    default void doIt(){
        System.out.println("Do it now");
    }
}*/

class A implements Sayable{
    protected int variable=6;
    public void check(){
        System.out.println("overridden");
    }
    public void doIt(String c){
        System.out.println(c);
    }
   public void say(int y){
       System.out.println("overloaded?");
   }
   public void say(){
        System.out.println("say somehting in implemented class");
    }
    void b() {
        System.out.println("different class static method");
    }
    A() {
        System.out.println("print constructor");
    }
}
public class MethodReference  {

    public static void print(){
        System.out.println("saykhjdh method");
    }
    public static void main(String[] args){

        // Thread t1= new Thread(A::new);
        //t1.start();
        //Sayable say1=A::new;
         //say1.say();
        A a=new A();
        a.check();

        //Sayable sayu=a::b;
      // sayu.say();
      //  Doable obj= MethodReference::print;
        //obj.say();
    }
}
