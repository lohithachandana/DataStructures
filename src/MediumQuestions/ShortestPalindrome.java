package MediumQuestions;
import java.util.*;
public class ShortestPalindrome {


    static String shortestPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(j>=0){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
            j--;
        }

        if(i==s.length())
            return s;

        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        return prefix+mid+suffix;
    }
    public static void main(String args[] ) throws Exception {
        //Write code here
        Scanner scan= new Scanner(System.in);
        int size=scan.nextInt();scan.nextLine();
        String str=scan.nextLine();

//	System.out.println(str);
        String palindrome=shortestPalindrome(str);
        System.out.println(palindrome);
        System.out.println(palindrome.length()-str.length());

    }
}
