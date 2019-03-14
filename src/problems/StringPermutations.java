package problems;

public class StringPermutations {

    static void printPermutations(String s){
            String out="";
            getPerm(s,out);
    }
    static void getPerm(String in,String out){
            if(in.length()==0){
                System.out.println(out+in);
            }

            for(int i=0;i<in.length();i++){
                getPerm(in.substring(0,i)+in.substring(i+1),out+in.charAt(i));
            }
    }

    public static void main(String[] args){
        String s="xyz";
        printPermutations(s);
    }
}
