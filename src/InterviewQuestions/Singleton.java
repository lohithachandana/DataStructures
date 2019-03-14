package InterviewQuestions;

//InterviewQuestions.A is singleton
class A{
    //make default constructor private,so that no object can be created by new InterviewQuestions.A();
    private  A(){
        System.out.println("Instance created");
    }
    static final  A a= new A();

    public static A getObj(){
        return a;
    }

    //static  InterviewQuestions.A a; //make the object static, so that it can be created only once

    //to all one single thread at a time to create instance
   /* public static synchronized InterviewQuestions.A getInstance(){

        if(a==null){
            a=new InterviewQuestions.A();
        }
        return a;

    }*/
}


public class Singleton {
    public static void main(String[] arhs){
      Thread t1= new Thread(new Runnable() {
          @Override
          public void run() {
              //new InterviewQuestions.A().getInstance();
              //InterviewQuestions.A.getInstance();
              A.getObj();
          }
      });

    Thread t2= new Thread(new Runnable() {
        @Override
        public void run() {
            //new InterviewQuestions.A().getInstance();
            //InterviewQuestions.A.getInstance();
            A.getObj();
        }
    });

    t1.start();t2.start();
    }
}
