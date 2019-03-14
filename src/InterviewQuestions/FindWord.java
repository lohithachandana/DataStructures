package InterviewQuestions;
import java.util.*;
public class FindWord {
  static void find(String s){
   String word="barclays";
    int n=word.length();
    String prev="";
    int firstReplacemntIndex=-1,wordFirstIndex=-1,lastReplacement=-1;


   for(int i=0;i<n-1;i++) {
       if(firstReplacemntIndex!=-1){
           break;
       }

       for (int j = i + 1; j < n; j++) {
           String tmp = word.substring(i,j+1);
           if (s.contains(tmp)) {
               prev = tmp;
           } else if(prev.length()>0) {

               wordFirstIndex = prev.length()-i+1;
               if(word.indexOf(prev)!=0){
                   firstReplacemntIndex=s.indexOf(prev)-1;
               }else{
                   firstReplacemntIndex = s.indexOf(prev) + prev.length() + 1;
               }
               break;
           }
       }

   }

   for(int i=wordFirstIndex;i<n;i++){
       String tmp=word.substring(i);
       if(s.contains(tmp)){
           lastReplacement=s.indexOf(tmp);
           break;
       }
   }

      System.out.println(lastReplacement-firstReplacemntIndex+1);
      for(int i=firstReplacemntIndex;i<=lastReplacement;i++){
          System.out.print(i+" ");
      }


  }

    public static void main(String[] args){
        String input="itiskarcwoys";
        find(input);

    }
}
