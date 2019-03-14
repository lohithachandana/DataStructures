package Practice;

public class QuickSort {

    static int partition(int[] arr,int start,int end){
        System.out.println(arr.length+" end is "+end);
      // Random rand= new Random(); int index=rand.nextInt(arr.length);
           int pi = start, pivot = arr[end];
           for (int i = start; i < end; i++) {
               System.out.println(arr[i]+" is the arr ele");
               if (arr[i] < pivot) {
                   //System.out.println(pi+" pivot index");
                   int temp = arr[pi];
                   arr[pi] = arr[i];
                   arr[i] = temp;
                   pi++;
               }
           }
        int temp = arr[pi];
        arr[pi] = arr[end];
        arr[end] = temp;

       return pi;
    }
    static void quicksort(int[] arr,int start,int end){
        if (start<end) {

            int pi = partition(arr, start, end);

            quicksort(arr, start, pi - 1);
            quicksort(arr, pi + 1, end);

        }
    }

    public static void main(String[] args){
        int[] arr={3,6,2,6,9,4,33,1,5};
        quicksort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
