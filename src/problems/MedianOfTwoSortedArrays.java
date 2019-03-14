package problems;
import java.util.*;

public class MedianOfTwoSortedArrays {
    static double findMedian(int[] nums1,int[] nums2){
            int[] out= new int[nums1.length+nums2.length];int i=0;
            for(i=0;i<nums1.length;i++){
                out[i]=nums1[i];
            }
            for(int j=0;j<nums2.length;j++){
                out[i]=nums2[j];i++;
            }
            Arrays.sort(out);
            System.out.println(out.length+" is out array");

            for(int m:out){
                System.out.println(m+" check content of M");
            }


            if(out.length==1){
                double val=out[0];
                return val;
            }
            if(out.length==2){
                double val=(out[0]+out[1])/2;
                return val;
            }
            int mid=out.length/2;
            double res= (out[mid]+out[mid+1])/2;
            return res;


     }


    public static void main(String[] args){
        int[] a={1,3,5,11,17};
        int[] b={9,10,11,13,14};
        System.out.println(findMedian(a,b));
    }
}
