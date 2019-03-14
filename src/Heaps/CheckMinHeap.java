package Heaps;

public class CheckMinHeap {
    private static boolean check(int[]in){
        int n=in.length;
        boolean value=true;
        for(int i=0;i<n;i++){
            int l=2*i+1;
            int r=2*i+2;
           if(l<n && in[i]>in[l]){
               return false;
           }
            if(r<n && in[i]>in[r]){
                return false;
            }
        }

        return value;
    }
    public static void main(String[] args){
        int[] arr={10, 15, 14, 25, 30};
        System.out.println("Is it min heap? "+check(arr));
    }
}
