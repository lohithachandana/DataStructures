package Practice;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;
public class TwoString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] input = new String[2];



        String a, b,c,d;

       // System.out.println("You input: " + a + " " + b+" "+c+" "+ d);
        String s="HelloWorld";
        s=s.substring(3,7);
        //System.out.println(s);


        String A="chandu";
        String B="chandu";
        String C= new String("chandu");
        if(A==B){
            System.out.println("same object");
        }
        if(A.hashCode()==B.hashCode()){
            System.out.println("same hashcode, same address");
        }
        if(A.hashCode()==C.hashCode()){
            System.out.println("same hashcode diff adreess");
        }
        if(A==C){

        }else{
            System.out.println("diff objs");
        }


    }
}