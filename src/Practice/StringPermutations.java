package Practice;
import java.util.*;

public class StringPermutations {
  static int count=0;
    public static Set<String> generatePermutations(String input) {

        Set<String> strList = new HashSet<String>();
       //StringPermutations.permutations("", input, strList);
        StringPermutations.permutations("", input);
        return strList;
    }

    //private static void permutations(String consChars, String input, Set<String> opContainer) {
    private static void permutations(String consChars, String input) {
        if(input.isEmpty()) {
           // opContainer.add(consChars);
            System.out.println(consChars+input);
            count++;
            return;
        }

        for(int i=0; i<input.length(); i++) {
           // permutations(consChars+input.charAt(i), input.substring(0, i)+input.substring(i+1), opContainer);
            permutations(consChars+input.charAt(i), input.substring(0, i)+input.substring(i+1));
        }
    }


        public static void main(String a[]) {

           // Set<String> output = StringPermutations.generatePermutations("xyz");
            //output.stream().forEach(System.out::println);
            String str="xxyz";
            String out="";
            permutations(out,str);
            System.out.println(count);
            //System.out.println(output.size());

        }


    }


