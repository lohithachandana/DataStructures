package queues;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;


public class PriorityQueues {
    public static int w=3;
    public static int i;
    public static int[] max=new int[6];
    public static void getmax(int[] in){
        int maxnum=0;

        for(int k=0;k<w;k++){

            if(in[k]>maxnum){
                maxnum=in[k];
            }
        }
        max[i]=maxnum;
        System.out.println(maxnum);
    }
    public static void main(String[] args){
        int[] a={1,3,-1,-3,5,3,6,7};
        int [] aux=new int[3];
        int Asize=a.length;
        for(i=0;i<Asize+1-w;i++){
            int q=0;
            for(int j=i;j<i+w;j++){
                if(q<aux.length) {
                    aux[q++] = a[j];
                }
            }
            getmax(aux);
        }
    }
}
