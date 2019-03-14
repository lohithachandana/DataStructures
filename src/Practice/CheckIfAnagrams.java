package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckIfAnagrams {
    static String sortChar(String a){
        char[] b= a.toCharArray();
        Arrays.sort(b);
        return new String(b);
    }

    public static void main(String[] ar){
        String a="torchwood";
        String b="doctorwho";
        if(sortChar(a).equals(sortChar(b))){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }

    }
}
