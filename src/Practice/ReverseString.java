package Practice;

public class ReverseString {
    static String useBuffer(String str){
        StringBuffer sb= new StringBuffer(str);
        return sb.reverse().toString();
    }

    static String reverse(String str){
        String rev="";
        if(str.length()==0){
            return "";
        }
        rev=reverse(str.substring(1))+str.charAt(0);
       // rev= str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
        return rev;
    }

    public static void main(String[] a){
        String str="ABCDEF";
        System.out.println(useBuffer(str));
        //System.out.println(reverse(str));
    }
}
