package Perfios.Submission;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Json {

    public static void isValid(String str){
        String empty="\\S";
        if(str.charAt(0)=='{' && str.charAt(str.length()-1)=='}'){
            if(str.length()==2){
                System.out.println("valid");
                return;
            }
            String pattern="('*')(:)('*')";
            //String pattern="(\"\\w+\"\\s*:\\s*\"?[\\w\\s]+\"?)";

            Pattern obj1 = Pattern.compile(pattern);
            Pattern obj2 = Pattern.compile(empty);
            Matcher m =obj1.matcher(str);

            if (m.find())
                System.out.println("valid");
            else
                System.out.println("InValid");
        }else if(str.charAt(0)=='[' && str.charAt(str.length()-1)==']'){

            String arrayPattern="((\"\\w+\"\\s*:\\s*\"?[\\w\\s]+\"?))";

            Pattern arr1=Pattern.compile(arrayPattern);
            Pattern arr2=Pattern.compile(empty);

            if (arr2.matcher(str).find()){
                if(str.length()==2){
                    System.out.println("valid");
                    return;
                }
            }
            Matcher m1 =arr1.matcher(str);
            str=str.substring(1,str.length()-1);
            System.out.println("str substring is "+ str);
//{'hg':'vhj','hgv':87}

            if((str.indexOf('{')>0 ||(str.indexOf('}')>0)) && m1.find()){
                System.out.println("valid");
            }else{
                System.out.println("InValid");
            }


        }else{
            System.out.println("InValid");
        }

    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String json= scan.next();
        isValid(json);
       /* String pattern="(\"\\w+\"\\s*:\\s*\"?[\\w\\s]+\"?)";

        Pattern obj1 = Pattern.compile(pattern);
       // Pattern obj2 = Pattern.compile(empty);
        Matcher m =obj1.matcher(str);

        if (m.find())
            System.out.println("valid");
        else
            System.out.println("InValid");
*/
    }
}
