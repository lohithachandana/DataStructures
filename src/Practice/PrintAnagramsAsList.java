package Practice;
import java.util.*;

public class PrintAnagramsAsList {


    public static String sortChars(String s)
    {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static List<List<String>> printInLists(String[] str){
        List<List<String>> result= new ArrayList<>();
        HashMap<String,Integer> prev= new HashMap<>();
        int i=0,count=0;
        //String prev=null;
        while(true){
            if(count>=str.length){
                break;
            }

            String curr= sortChars(str[i]);
            List<String> tmp= new ArrayList<>();
            for(String s:str){
                if(sortChars(s).equals(curr)&& !(prev.containsKey(curr))){
                    tmp.add(s);
                    count++;
                }
            }
            prev.put(curr,1);
            if(!tmp.isEmpty()){
                result.add(tmp);
            }

            i++;
        }
        return result;
    }

    public static void main(String[] a){
        String[] input={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result= printInLists(input);
        System.out.println(result);
 }
}
