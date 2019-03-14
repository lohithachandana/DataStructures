package Practice;

public class IntToString {

    static String reverseString(String s){
        String rev="";
        if(s.length()==0){
            return "";
        }
        rev=reverseString(s.substring(1))+s.charAt(0);
        return rev;

    }
    static String  convert(int num,String out){

      //  String out=""t
        while(num!=0){
            out=out+ num%10;
            num=num/10;
        }
         return reverseString(out);
    }

    public static void main(String[] args){
        int i=3456;
        System.out.println(convert(i,""));
    }
}
