package Practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DatatypesSimple {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        System.out.println("enter int");
        int inI=scan.nextInt();
        System.out.println("enter dohuble");
        double inD=scan.nextDouble();
        System.out.println("enter string");
        scan.nextLine();
        String inS=scan.nextLine();
       // System.out.println(inS+" cehck");


        System.out.println(i+inI);

        System.out.println(d+inD);
        s=s+inS;
        System.out.print(s);
    }
}
