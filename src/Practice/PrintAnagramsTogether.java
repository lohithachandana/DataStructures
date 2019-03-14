package Practice;
//import Practice.StringPermutations;
import java.util.*;

public class PrintAnagramsTogether implements Comparator<String> {


        public static String sortChars(String s)
        {
            char[] content = s.toCharArray();
            Arrays.sort(content);
            return new String(content);
        }

        @Override
        // compares its two argument strings for order
        public int compare(String s1, String s2) {

            return sortChars(s1).compareTo(sortChars(s2));

        }



             public static void main(String[] args) {
                 PrintAnagramsTogether ob= new PrintAnagramsTogether();
                 String[] strArray = {"geeksquiz", "zuiqkeegs","geeksforgeeks",
                         "forgeeksgeeks","abcd"};

                 //  Arrays.sort(strArray);



                 Arrays.sort(strArray, new PrintAnagramsTogether());

                 for (int i = 1; i < strArray.length; i++)
                     System.out.println(strArray[i]);

             }

}
