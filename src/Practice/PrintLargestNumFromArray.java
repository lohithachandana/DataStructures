package Practice;

import java.util.*;

public class PrintLargestNumFromArray {
    public static void main(String[] a){
       // int[] arr={40,69,53,23,12,43};
        List<String> arr=new ArrayList<String>(){{
            add("44");
            add("56");
            add("21");
            add("96");
            add("76");
        }};
        Comparator<String> comp=new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String  XY=s1+s2;
                String YX=s2+s1;
                return XY.compareTo(YX)<0?1:-1;
            }
        };
        Collections.sort(arr,comp);
        String out="";
        for(String i:arr ){
            i=out+i;
            System.out.print(i);
        }
    }
}
