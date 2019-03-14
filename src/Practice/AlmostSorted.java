package Practice;
import java.util.*;
public class AlmostSorted {


    public static void main(String[] a){
        int[] arr={1,5,4,3,2,6};int ups=0,downs=0;
        List val= new ArrayList();
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                val.add(1);//Up
                ups++;
            }
            if(arr[i]<arr[i-1]){
                val.add(0);//down
                downs++;
            }
        }
        if(ups==arr.length-1) {
            System.out.println("yes");
        }else if(downs==arr.length-1){
            System.out.println("yes");
            System.out.println("reverse "+1+" "+arr.length);
        }/*else if(){

        }*/
    }
}
