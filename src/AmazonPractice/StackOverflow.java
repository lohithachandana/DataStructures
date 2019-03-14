package AmazonPractice;

public class StackOverflow {

    static int dosomething(String s){

        int a=dosomething(s);
        return a;
    }


    public static void main(String[] args){
        String a="sldfsd";
        dosomething(a);
    }
}
