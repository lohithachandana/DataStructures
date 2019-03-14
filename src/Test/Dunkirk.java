package Test;
import java.util.Arrays;
import java.util.Scanner;
public class Dunkirk {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
int[] a= new int[n];int[] b= new int[n];
        for(int i=0;i<n;i++) {
          a[i]= scan.nextInt();
          b[i]=a[i];
        }


        Arrays.sort(b);

        int min=b[0];

            for(int i=0;i<n;i++){
                if(a[i]==min){
                    System.out.println(i+1);
                    return;
                }
            }

       // System.out.println(a[0]);
    }
}
