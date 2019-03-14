package DailyCoding_CS_DOJO;

import java.util.HashSet;

public class Day1_pairGivesSumKInArr {

    static boolean findSum(int[] arr,int k){
        HashSet<Integer> set= new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int i:arr){
            if(set.contains(k-i)){
                System.out.println(i+" "+(k-i));
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr={12, 23, 10, 41, 15, 38, 27};
        int k=50;
        System.out.println(findSum(arr,k));
    }
}
