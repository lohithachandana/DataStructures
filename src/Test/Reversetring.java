package Test;

public class Reversetring {

    static void reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        //return sb.toString();

    }
    public static void main(String[] args){
        String s="Lohitha";
        reverse(s);
    }

}
