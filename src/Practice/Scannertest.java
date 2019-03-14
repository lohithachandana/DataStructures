package Practice;
import java.util.*;
public class Scannertest {
    public static void main(String[] a){
        Scanner scan= new Scanner(System.in);
       // int T=scan.nextInt();
        //for(int i=0;i<T;i++){
           // String word=scan.next();

            //printIndices(word);
           // System.out.println(word);
      //  }
        int i=51,n1=27,n2=50;

        while(true){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }

}
