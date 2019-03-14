package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class NewFindWord {
    static String convertToString(List<String> a){
        String out="";
        for(String i:a){
            out=out+i;
        }
        return out.trim();
    }

  static void find(String s){
      String word="barclays";
      String[] wA=word.split("");
      String[] sA=s.split("");
      List<String> wordList=new ArrayList<>(Arrays.asList(wA));
      List<String> stringList=new ArrayList<>(Arrays.asList(sA));
      stringList.retainAll(wordList);
      String common=convertToString(stringList);


      Queue<Integer> q= new LinkedList<>();
      String prev="";
      int n=common.length();
      int firstreplacement=-1;
      for(int i=0;i<n;i++){
         // if(word.startsWith(Character.toString(common.charAt(i)))){
              for(int j=i+1;j<n;j++){
                  String tmp=common.substring(i,j+1);
                  if(s.contains(tmp)){
                      prev=tmp;
                  }else if(prev.length()>0){
                      if(word.indexOf(prev)>0){
                          firstreplacement=s.indexOf(prev)-word.indexOf(prev);
                          word=word.substring(0,word.indexOf(prev))+word.substring(word.indexOf(prev)+prev.length());
                          for(int k=firstreplacement;k<s.indexOf(prev);k++){
                              System.out.println(k+" cehck k");
                              ((LinkedList<Integer>) q).push(k);
                          }

                      }else if(word.indexOf(prev)==0){
                          firstreplacement=s.indexOf(prev)+prev.length();
                          ((LinkedList<Integer>) q).push(firstreplacement);
                          word=word.substring(prev.length());
                      }
                     // System.out.println(j);

                  }

              }
          //}
      }
      if(prev.length()>0){
          word=word.substring(0,word.indexOf(prev))+word.substring(word.indexOf(prev)+prev.length());
      }
      int lastReplacement=s.indexOf(prev);
      for(int i=q.peek()+1;i<lastReplacement;i++){
          ((LinkedList<Integer>) q).push(i);
      }

      System.out.println(word.length());
      while(q!=null){
          int print=((LinkedList<Integer>) q).pollLast();
          print++;
          System.out.print(print+" ");
      }


  }
    public static void main(String[] args){
        String input="itisarcwoys";
        find(input);

    }
}
