package problems;
class A{
  //  int i=6;
     void method(){

    }

}
public class StringObjects extends A {
int i=5;
void method(){
    int j=0;
}
    static int check(){

        try{
            throw new Exception();
            //return 1;
        }finally {
            return 2;
        }


    }


public static void main(String[] args){
    String a="abc";
    String b=new String("abc");
    String c=a;
    System.out.println(a==b);
    System.out.println(a.hashCode()==b.hashCode());
    System.out.println(c==a);
    System.out.println(c.hashCode()==a.hashCode());



}
}
