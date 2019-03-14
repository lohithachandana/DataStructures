package Sorting;

public class QuickSort {

    private static int partition(int in[],int start,int end){
        int pivot=in[end];
        int pi=start;
       // int j=start;
        for(int i=start;i<end;i++){
            if(in[i]<pivot){
                int temp=in[pi];
                in[pi]=in[i];
                in[i]=temp;
                pi++;
            }
        }
        int temp=in[pi];
        in[pi]=in[end];
        in[end]=temp;
        return pi;
    }

    private static int randomise(int[] arr, int start,int end){
        int pi= (int)(start+Math.random()*(end-start+1));
        int temp=arr[pi];
        arr[pi]=arr[end];
        arr[end]=temp;
        return partition(arr,start,end);
    }
    private static void quicksort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
       // System.out.println( start+" start " +end+" end ");
        int pivIn=randomise(arr,start,end);
       // System.out.println("pI is "+pivIn);
        quicksort(arr,start,pivIn-1);
        quicksort(arr,pivIn+1,end);
    }

    public static void main(String[] args){
        int a[]={10,8,9,7,1,5,16};
        int n=a.length;
        quicksort(a,0,n-1);
        for (int i=0; i<n; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
