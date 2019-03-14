package Practice;
public class CountObj {
   static int i=0;
    public CountObj(){
        i++;
//counts the number of objects created
    }
    void counter(){
        System.out.println(i);
    }
    public static void main(String[] a){
        CountObj onj= new CountObj();
        CountObj onj1= new CountObj();
        CountObj onj2= new CountObj();
        CountObj onj3= new CountObj();
        onj.counter();
    }
}
