package InterviewQuestions;

import java.util.*;

public class WordBreak {

    static String sortChars(String s)
    {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    static void print(String in, String out){

        Map<Integer,String> order= new TreeMap<>();
        String[] check=out.split(" ");
        String prev="";int previ=0;

        for(int i=0;i<check.length;i++){
            if(check[i].equals(prev)){
                order.put(in.indexOf(check[i],prev.length()+previ-1),check[i]);
                previ=in.indexOf(check[i],prev.length()+previ-1);

            }else{
                order.put(in.indexOf(check[i]),check[i]);
                previ=in.indexOf(check[i]);
            }
            prev=check[i];


        }
        Set<Map.Entry<Integer,String>> entry=order.entrySet();
        System.out.print("Sentence: ");
        for(Map.Entry<Integer,String> e:entry){
            System.out.print(e.getValue()+" ");
        }
    }


    static void samelines(String in,String out) throws Exception{

        String compare = out.replaceAll(" ","");
        if(sortChars(in).equals(sortChars(compare))){
            System.out.println("True");
            print(in,out);

        }else{
            System.out.println("False, because it cannot make a proper sentence");
            throw new Exception();
        }

    }

    static String addWords(String word,String line,String out){
        if(line.length()==0){
            return out;
        }
        int si=line.indexOf(word);
        int len=word.length();
        if (line.contains(word)) {
            out=out+word+" "+addWords(word,line.substring(len+si-1),out);;
        }

        return out;
    }

    static void exists(String[] w,String s){
        String out="",res="";
        int n = w.length;

        for(int i=0;i<n;i++){
            if(s.contains(w[i])){
                res= res+addWords(w[i],s,out);
            }
        }
        System.out.println("res: "+res);
        try{
            samelines(s,res);

        } catch(Exception e){

            System.out.println("No such combination exists");
        }

    }

    static void check(String line,String[] words){
        List<String> list= Arrays.asList(words);
        for(int i=0;i<line.length();i++){


        }
    }







    public static  boolean wordBreak(String s, Set<String> wordDict) {
        int[] pos = new int[s.length()+1];

        Arrays.fill(pos, -1);

        pos[0]=0;

        for(int i=0; i<s.length(); i++){
            if(pos[i]!=-1){
                for(int j=i+1; j<=s.length(); j++){
                    String sub = s.substring(i, j);
                    System.out.println(sub+" is subString");
                    if(wordDict.contains(sub)){
                        pos[j]=i;
                    }
                }
            }
        }

        return pos[s.length()]!=-1;
    }



    public static List<String> wordBreak1(String s, Set<String> wordDict) {
        ArrayList<String> [] pos = new ArrayList[s.length()+1];
        pos[0]=new ArrayList<String>();
       //pos[0].s

        for(int i=0; i<s.length(); i++){
            if(pos[i]!=null){
                for(int j=i+1; j<=s.length(); j++){
                    String sub = s.substring(i,j);

                    if(wordDict.contains(sub)){
                       // System.out.println("sub is: "+sub+ " b/w "+i+" & "+j);
                        if(pos[j]==null){
                            ArrayList<String> list = new ArrayList<String>();
                            list.add(sub);
                            pos[j]=list;
                        }else{
                            pos[j].add(sub);
                        }

                    }
                }
            }
        }

        if(pos[s.length()]==null){
            System.out.println("False, cannot make a line");
            return new ArrayList<String>();
        }else{
            ArrayList<String> result = new ArrayList<String>();
            dfs(pos, result, "", s.length());
            System.out.println("True");
            return result;
        }
    }

    public static void dfs(ArrayList<String> [] pos, ArrayList<String> result, String curr, int i){
        if(i==0){
            result.add(curr.trim());
            return;
        }

        for(String s: pos[i]){
            String combined = s + " "+ curr;
            dfs(pos, result, combined, i-s.length());
        }
    }




    public static void main(String[] args){
        //String[] words={"This","test","a","morgan","Stanley","sample","is"};
        // String sentence="Thisisasampletest";

        // String[] words={"The","of","work","star","wow","is"};
        //String sentence="TheworkofThestarisThewow";

        String[] words={"cat","cats","and","sand","dog"};
        String sentence="catsanddog";
        // exists(words,sentence);
        List<String> list= Arrays.asList(words);
        Set<String> dict= new HashSet<>();dict.addAll(list);
        System.out.println(wordBreak1(sentence,dict).toString());


    }
}
