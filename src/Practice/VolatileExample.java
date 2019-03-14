package Practice;

class Check1 extends Thread{
    static volatile int count=0;
    public void run(){
        System.out.println(currentThread().getName()+" "+count+" :before");
        count++;
       // System.out.println(currentThread().getName()+" "+count);
    }


}

public class VolatileExample {
    public static void main(String[] args) throws  Exception{
       Thread t1= new Check1();
       Thread t2= new Check1();
        Thread t3= new Check1();
        Thread t4= new Check1();
        Thread t5= new Check1();
       t1.start();
        t3.start();
        t4.start();
        t5.start();
        t1.join();
        t3.join();
        t4.join();
        t5.join();
t2.start();
        System.out.println(((Check1) t1).count+" in main");
      /* t2.start();
        t3.start();
        t4.start();
        t5.start();
*/
    }
}
