package MediumQuestions;

public class RemoveKdigits {
    static void removeKdigits(int num,int k){
        String n=Integer.toString(num);
        if(k==n.length()){
            System.out.println("0");
        }
        StringBuilder sb=new StringBuilder(n);
        for(int j=0; j<k; j++){
            int i=0;
            while(i<sb.length()-1&&sb.charAt(i)<=sb.charAt(i+1)){
                i++;
            }

            sb.delete(i, i+1);

        }

        //remove leading 0's
        while (sb.length() > 1 && sb.charAt(0)=='0')
            sb.delete(0,1);

        if(sb.length()==0){
            //return "0";
            System.out.println("0");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args){
            int a=4325043;
            //removeKdigits(a,3);
        String b="cfsa";

    }
}
