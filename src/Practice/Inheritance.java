package Practice;

class Parent {

    Parent(){
        System.out.println("parent constructor");
    }
     int get()throws ArithmeticException{
        return 0;
    }
}

public class Inheritance extends  Parent {
  /*  Inheritance(int i){
        System.out.println("Inheritance name");
    }*/
  int iget() throws ArithmeticException{
      return  2;
  }
  int iget(int a,int b){
      System.out.println("int");
      return  2;
  }
  int iget(Integer a,Integer b){
      System.out.println("Int");
      return -1;
  }

    private Inheritance(){
        System.out.println("inheritance is the parent class");
    }

    void method(){
        System.out.println("method name");
    }
     class B extends Inheritance {
        B() {
            System.out.println("nested Subclass");
        }
    }
    public static void main(String as[]) {
        Inheritance obj= new Inheritance();
        Inheritance.B obj1= obj.new B();
        //obj.get(new Integer(1),new Integer(3));
       // Inheritance.B obj1= new Inheritance.B();

    //Thread t1;//Consumer<String> con;
    //Inheritance obj= new Inheritance(7);
   // obj.method();
    }
}