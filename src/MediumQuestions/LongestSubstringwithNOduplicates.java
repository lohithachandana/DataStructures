package MediumQuestions;
import java.util.*;
public class LongestSubstringwithNOduplicates {

    public static  int lengthOfLongestSubstring(String s) {
   /*     Set<Character> set= new HashSet<>();
        int res=0,start=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(set.contains(c)){
            while(start<i){
                if(s.charAt(start)==s.charAt(i)){
                    start++;break;
                }else{
                    set.remove(s.charAt(start));start++;
                }
            }
        }else{
            set.add(c);
            res= Math.max(res,set.size());
        }

    }
        return res;
    }*/

        Hashtable<Character,Integer> index= new Hashtable<>();
        int start=0,res=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(index.containsKey(curr)){
                int  startedAt=index.get(curr);
                if(startedAt>=start){
                    start=startedAt;
                    start++;
                }

            }
            index.put(curr,i);

            res=Math.max(res,i-start+1);
        }

        return res;
    }


    public static void main(String[] args){


        System.out.println(lengthOfLongestSubstring("GEEKSGEEKSFOR"));
    }
}
