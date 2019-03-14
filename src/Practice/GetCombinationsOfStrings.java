package Practice;

public class GetCombinationsOfStrings {


    static void getCombinations(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            char curr=s1.charAt(i);
            String tmp=Character.toString(curr);
            printComb(tmp,s2);
        }
    }
    static void printComb(String tmp,String b){
        for(int i=0;i<b.length();i++){
            char curr=b.charAt(i);
            String append=Character.toString(curr);
            System.out.println(tmp+append);
       }
    }

    public static void main(String[] args){
        String a="abc";
        String b="defth";
        getCombinations(a,b);
    }
}
