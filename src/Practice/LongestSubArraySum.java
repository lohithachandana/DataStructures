package Practice;

import java.util.HashMap;

public class LongestSubArraySum {
//contagiousSum
    public static void print(int len,int index,int[] arr){
        int si=index-len+1;
        for(int i=si;i<index+1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int max = 0;

        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(sum==k){
                max = Math.max(max, i+1);
            }

            int diff = sum-k;

            if(map.containsKey(diff)){

                max = Math.max(max, i-map.get(diff));
                System.out.println(i-max+1);
                System.out.println(i);
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        if(map.containsKey(sum)){


            print(max,map.get(sum),nums);
        }
        return max;
    }

    public static void main(String[] args){
        //int[] arr={3,1, -1, 5, -2};
        int[] arr={2,3,9,7,5};
        int k=5;
        System.out.println(maxSubArrayLen(arr,k));
    }
}
