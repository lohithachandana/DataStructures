package Leetcode;

import java.util.HashMap;

public class RemoveDupsfrmArr {
   /* public static void removeDups(int[] in){
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<in.length;i++){
            if(map.containsKey(in[i])){

            }else{
                count++;
                map.put(in[i],count);
            }
        }
        int[] res=new int[map.size()];
        map.forEach((k,v)->res[v-1]=k);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 2, 1, 1};
        removeDups(arr);
    }*/
   public static int removeDuplicates(int[] nums) {
       int count=0;
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){

           }else{
               count++;
               map.put(nums[i],count);
           }
       }
       int size=map.size();
       map.forEach((k,v)->nums[v-1]=k);
       for(int i=0;i<size;i++){
           System.out.println(nums[i]);
       }

       return size;
   }
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 2, 1, 1};
        System.out.println(removeDuplicates(arr));
    }
}
