package Practice;

import java.util.Scanner;

public class Parellolgram {
    public static int B,H;
    public static boolean flag= true;
    static{
        Scanner scan= new Scanner(System.in);
       B=scan.nextInt();
       H= scan.nextInt();

        if(B<0 || H<0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args){
        if(flag){
            int area= B*H;
            System.out.println(area);
        }
    }
}
