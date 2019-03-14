package recurrsion;

import java.util.Arrays;

public class Main {
    public static void towersOfHanoi(int n,char from, char to, char aux){
        if(n==1){
           System.out.println("move 1st disk from "+ from +
           " to "+ to);
        }
        else {
            towersOfHanoi(n-1,from,aux,to);
            System.out.println("move "+n+"th disk from "+ from +" to "+ to);
            towersOfHanoi(n-1,aux,to,from);
        }

    }

    public static int a[] = {1, 2, 3, 5, 4};

    public static void isSorted(int startIndex) {
        int l = a.length - startIndex;

        if(l == 1) {
            System.out.println("sorted");
        }
        else if(a[startIndex] < a[startIndex+1]) {
            isSorted(startIndex+1);
        } else {
            System.out.println("not sorted");
        }
    }

    public static int[] sort(int[] inputArray) {
        int arrayLength = inputArray.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i+1; j < arrayLength - 1; j++) {
                if (inputArray[i] > inputArray [j]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }

    static int[] A = {1,1};

    public static void printAllStrings(int n) {
        if (n<1) {
            System.out.println(Arrays.toString(A));
        } else {
            A[n-1] = 0;
            printAllStrings(n-1);
            A[n-1] = 1;
            printAllStrings(n-1);
        }
    }

    public static void main(String[] args) {
//        towersOfHanoi(3,'a','c','b');
//        isSorted(0);
//
//        int[] inputArray = { 5,4,3,2,1};
//        int[] result = sort(inputArray);
//        for (int i = 0; i< result.length; i++) {
//            System.out.println(result[i]);
//        }

//        printAllStrings(2);

    }
}
