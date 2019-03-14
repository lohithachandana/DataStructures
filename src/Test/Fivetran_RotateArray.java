package Test;

public class Fivetran_RotateArray {
    static String getShiftedString(String s, int leftShifts, int rightShifts) {
        int n=s.length(),j; char[] a= s.toCharArray();
        char b[]=new char[a.length];
        int l=leftShifts%n;
        int r= rightShifts%n;
        //for left shift

        for(int i=0;i<n;i++){
            char tmp=a[i];
            j=i-l;
            if(j<0){
                j=j+n;
                b[j]=tmp;
            }else{
                b[j]=tmp;
            }
           // System.out.println("j:"+ j);
        }
        //System.out.println(new String[b]);
        for(int i=0;i<n;i++){
            char tmp=b[i];
            j=i+r;
           // System.out.println("j2:"+ j );
            if(j>n-1){
                j=j-n;
                a[j]=tmp;
            }else{
                a[j]=tmp;
            }
        }
        String out=new String(a);
        return out;

    }

    public static void main(String[] args){
        String s="abcd";
        int l=174, r=153;
        System.out.println(getShiftedString(s,l,r));
    }
}
