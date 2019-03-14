package Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AngryKids {


    // Complete the angryChildren function below.
    static long angryChildren(int k, int[] packets) {
        List<List<Integer>> list= new ArrayList<>();
        HashMap<Long,Integer> map= new HashMap<>();
        Arrays.sort(packets);
        long sum=0,min=Integer.MAX_VALUE;
        int n=packets.length;
        for(int i=0;i<n+1-k;i++){
            int curr=packets[i];
            List<Integer> diffList= new ArrayList<>();
            for(int j=0;j<n;j++){
                int diff=curr-packets[j];
                diffList.add(Math.abs(diff));
                sum=sum+Math.abs(diff);
            }
            list.add(diffList);map.put(sum,i);
            System.out.println(sum+" sum");
            if(min>sum){
                min=sum;sum=0;
            }
        }
        int index=map.get(min);
        List<Integer> minList=list.get(index);
        for(int i:minList){
            System.out.println(i+ "diff of an ele with other eles of array");
        }

        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       int[] arr={3,3,4,7};
       int k=3;
        System.out.println(angryChildren(k,arr));
    }
}
