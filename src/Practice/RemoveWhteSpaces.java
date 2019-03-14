package Practice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class RemoveWhteSpaces {

    public static void main(String[] args){
        String dt="2017-10-21";
        LocalDate date= LocalDate.parse(dt,DateTimeFormatter.ofPattern(dt,Locale.ENGLISH));
        System.out.println(date);
        //check isemprty, trim,replaceAll functionalities
   /*     String str1=" ";
        String str2=" A Chan Lohitha ";
        System.out.println(str1.isEmpty());
        System.out.println(str2.trim());*/


        //print alphabets
        /*char c;

        for(c = 'A'; c <= 'Z'; c++)
            System.out.print(c + " ");*/



        /*String[] strings = {"One", "Two", "Three", "Four", "Five"};
        String toFind = "Four";
        for(String s:strings){
            if(s.equals(toFind)){
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");*/


        int num = 5, i = 1;
        while(i <= 10)
        {
          //  System.out.println(num+" "+"x"+" "+ i+" "+"="+" "+ num * i);
            i++;
        }
    }
}
