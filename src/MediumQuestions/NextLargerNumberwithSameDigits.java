package MediumQuestions;

import java.util.Arrays;

public class NextLargerNumberwithSameDigits {
    static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    static void sortArray(int[] a,int i){
        int len=a.length-i+1,index=0;
        int[] tmp= Arrays.copyOfRange(a,i,a.length);
        Arrays.sort(tmp);
        for(int j=i;j<a.length;j++){
            a[j]=tmp[index];index++;
        }
    }

    static int[] findNext(int[] a){
        int n=a.length;
        int[] out=new int[a.length];int i,j;
        //find the element from the end where ascending order stops
       for(i=n-1;i>=0;i--){
            if(a[i]>a[i-1]){
                break;
            }
        }
       // sort the array after this found index
        sortArray(a,i);

       //find the index of  number which is immeidate-higher than the value at this found index
        for( j=i;j<n;j++){
            if(a[j]>a[i-1]){
                break;
            }
        }
        //swap those elements;
        swap(a,i-1,j);
        return a;
    }

    public static void main(String[] args){
        //int[] a={1,2,3,4};
        int[] a={3,2,4,1,8};
        int[] next=findNext(a);
        for(int i:next){
            System.out.print(i+" ");
        }
    }
}
