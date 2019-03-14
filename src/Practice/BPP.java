package Practice;

import java.util.HashMap;

public class BPP {

   static int  exists(int[] arr,int X){
        int n=arr.length;
        HashMap<Integer,Boolean> map= new HashMap<Integer,Boolean>();
        for(int i=0;i<n;i++){
            int required= X-arr[i];
            if(map.containsKey(required)){
               // System.out.println("1");
                return 1;
            }else{
                map.put(arr[i],true);
            }
        }
        return 0;
       // System.out.println("0");
    }

    public static void main(String[] args){
        int[] a={1,5,10,8};int[] b={2,21,13};int min=0;
        for(int i=0;i<b.length;i++){

            int min1=exists(a,b[i]);
           if(min1>min){
                min=min1;
            }

        }
        System.out.println(min);


    }
}
