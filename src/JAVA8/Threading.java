package JAVA8;


import java.util.ArrayList;


class Num {
   // boolean odd= false;
    public void even(int i){

            if(i%2==0){
                System.out.println("even: "+i);
              //  wait();
            }
            //notify();

    }
    public  void odd(int i) {


            if (i % 2 == 1) {
                System.out.println("odd: " + i);
              //  wait();
            }
           // notify();


    }
}


 class Producer implements Runnable{
    Num n;
    Producer(Num n){
       this.n=n;
        Thread t=new Thread(this);
        t.start();
    }
    public void run() {
        int i=0;
        while(true) {
            new Num().even(i);
            try {Thread.sleep(500); } catch (Exception e) { }
            i++;
        }
    }
 }
 class Consumer implements  Runnable{
    Num n;
    Consumer(Num n){
       this.n=n;
        Thread t= new Thread(this);
        t.start();
    }
    public void run(){
        int i=0;
        while(true) {
            new Num().odd(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            i++;
        }
    }
 }
public class Threading {

    public static void main(String[] args){
        Num n=new Num();
        new Producer(n);
        new Consumer(n);
    }

}
