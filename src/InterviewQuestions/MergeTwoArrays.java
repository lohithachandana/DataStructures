package InterviewQuestions;
import  java.util.*;
public class MergeTwoArrays {
    static void merge(int[] a,int[] b){
        Stack<Integer> s= new Stack<>();

        int n1=a.length,n2=b.length;
        int index=0;int[] res=new int[n1+n2];
        int n=n1<n2?n1:n2;int i=0,j=0;
        while(i<n1 && j<n2){
           if(a[i]<b[j]){
               res[index]=a[i];
               index++;i++;
           }else{
               res[index]=b[j];
               index++;j++;
           }
        }
        //if(j<n2){
           while(j<n2){
               if(b[j]<a[i]){
                   res[index]=b[j];
                   index++;j++;
               } else {
                   res[index]=a[i];
                   index++;i++;
               }
           }

       // }
        if(i<n1){
            while(i<n1){
                    res[index]=a[i];
                    index++;i++;
            }
        }
        for(int m:res){
            System.out.println(m);
        }
    }

    public static void main(String[] args){
        int[] a1={2,3,4,6},a2={1,5};


        merge(a1,a2);
    }
}
