package Practice;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < order; i++) {
            /*for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }*/
            for (int i1 = 0; i1 < arr.length - 1; i1++) {
                int temp = arr[i1];
                arr[i1] = arr[i1 + 1];
                arr[i1 + 1] = temp;
            }
        }
    }
    public static void main(String[] arg){
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
