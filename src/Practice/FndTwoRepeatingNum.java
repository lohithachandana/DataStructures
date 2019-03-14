package Practice;

import java.util.Arrays;

public class FndTwoRepeatingNum {


    public static void main(String[] a){
        int[] input={1, 2, 3, 1, 3, 6, 6};
        Arrays.sort(input);
        for(int i=1;i<input.length;i++){
            if(input[i]==input[i-1]){
                System.out.println(input[i]);
            }
        }
    }
}
