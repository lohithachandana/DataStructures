package InterviewQuestions;

public class AnonymousClass {
    static boolean fix(boolean b1){
        b1=false;return b1;
    }
    public static void method(){
        throw  new Error();
    }


    public static  void main(String[] args) {

        try {
            method();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
