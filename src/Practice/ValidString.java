package Practice;

import java.lang.reflect.Array;
import java.util.*;

public class ValidString {
    static String isValid(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char i : arr) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i), map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        ArrayList<Integer> valueList = new ArrayList(map.values());
        Object a[] = valueList.toArray();
        Integer[] in = new Integer[a.length];
        for (int j = 0; j < a.length; j++) {
            in[j] = (Integer) a[j];
            System.out.print(in[j] + " ");
        }
        System.out.println();
        Arrays.sort(in);


        int count = 0, curr = in[0];
        if(curr==1 && in.length>1){
            int tmp=in[1];
            for(int k=2;k<in.length;k++){
                if(in[k]>tmp){
                    count++;
                }
            }
            if(count==0){
                return "YES";
            }
        }
count=0;

        for(int k=1;k<in.length;k++){
            int diff=Math.abs(curr-in[k]);
            if(in[k]>curr){
                count=count+diff;
            }

        }


        /*while (k < in.length && in[k]>0) {

          *//* if(in[k]>curr){

               count++;
               if(count==1){
                   in[k]--;
                   k=0;
               }
           }*//*

            if (in[k] > curr) {
                System.out.println(in[k] + " entered in[k]");
                if (curr == 1 && k == 1) {
                    if (in[k + 1] == in[k]) {
                        //curr=in[k];
                        curr--;
                        if(curr==0){

                        }else{
                            count++;
                        }

                    } else {
                        in[k] = in[k] - 1;
                        count++;
                    }
                    k = 0;
                } else {

                    count++;
                    in[k] = in[k] - 1;
                    System.out.println(in[k] + " after");
                    k = 0;
                    System.out.println(count + " after");

                }
            }

            if (in[k] < curr) {
                if (k + 1 < in.length && in[k + 1] < curr) {
                    count++;
                    curr--;
                    k = 0;
                } else if (k + 1 < in.length && in[k + 1] == curr) {
                    //check for 323 case later
                    count++;
                    in[k]--;
                    k = 0;
                } else if (in[k - 1] == curr) {
                    count++;
                    in[k] = curr;
                    k = 0;
                }
            }
            k++;
        }


       System.out.println(count+" is count");*/
           if(count==1||count==0)

    {
        return "YES";
    }else

    {
        return "NO";
    }

}


    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String input= scan.nextLine();
        System.out.println(isValid(input));


    }
}
