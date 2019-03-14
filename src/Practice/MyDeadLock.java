package Practice;

public class MyDeadLock {

    String str1 = "Java";
    String str2 = "UNIX";

    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                        System.out.println(str1+str2);
                    // try{Thread.sleep(50);}catch(Exception e){}

                }
            }
        }

    };

    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                        System.out.println(str2 + str1);
                }

            }
        }

    };

    public static void main(String a[]){
        MyDeadLock obj = new MyDeadLock();
        obj.trd1.start();
        obj.trd2.start();
    }
}