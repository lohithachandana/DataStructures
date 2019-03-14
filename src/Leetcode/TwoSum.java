package Leetcode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        boolean check =true;
        int i=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int j=0;j<n;j++) {
            if(map.containsKey(nums[j])){
                //System.out.println(map.get(nums[j])+" check"+" j: "+j);
                System.out.println(map.get(nums[j])+" "+nums[j]);
               // return new int[]{map.get(nums[j]),j};
            }else{
               // map.put(target-nums[j],j);
                map.put(target-nums[j],nums[j]);
            }
        }
        //System.out.println("not found");
       return new int[]{0,0};
    }
    public static void main(String[] args){
        int[] nums={10,11,8,15,1,-1,3,11};
        int k=9;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        map.put(3,4);
        map.put(5,2);
        map.put(null,5);
       // int[] res= twoSum(nums,k);
       // System.out.println(res[0]+" "+res[1]);

    }
}
