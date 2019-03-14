package Practice;

import java.util.HashMap;

public class CanJump {
  /*  public static boolean canJump(int[] nums,int n,int index,int target){
            int i=index;
            for(int j=1;j<=n;j++){
                System.out.println(i+" "+j);
                if(i+j>=target){
                    //count++;
                    return true;
                }else if(nums[i+j]==0){
                    //return false;
                    continue;
                } else{
                    //if(i+j<target){
                        System.out.println(i+j+" :new index");
                        boolean status=canJump(nums,nums[i+j],i+j,target);
                        if(status){
                           // count++;
                            return true;
                        }


            }
        }
            return false;
    }

    public static  boolean canJump1(int[] nums) {
        int n=nums.length;
        int target=n-1;
        if(n==1){
           return true;
        }
        int i=0;boolean status =true;
        while(status){
            status=canJump(nums,nums[i],i,target);
            if((i+nums[i]==target) || status){
                return true;
            }
        }
        return false;
    }*/


    public static boolean canJump(int[] nums){
        if(nums.length<=1){
            return true;
        }
        int max=nums[0];int target=nums.length-1;
        for(int i=0;i<nums.length;i++){

            if(i+nums[i]>max){
               max=i+nums[i];

            }
            if(max>=target){

                return true;
            }
            if(max<=i && nums[i]==0){

                return false;
            }

        }
        return false;
    }
    public static int jump(int[] nums) {
        int jump=0,lastjump=0,step=0;


        for(int i=0;i<nums.length&&i<=jump;i++){
            jump=Math.max(jump,i+nums[i]);
            if(i>lastjump){
                lastjump=jump;
                step++;
            }
        }
        if(jump<nums.length-1){
            return 0;
        }
        return step;
    }

    public static void main(String[] args){
      int[] nums={9};
     //int[] nums={2,0,0};
       //  int[] nums={2,3,0,1,4};
       // int[] nums1={7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
      //  int[] nums={3,2,1,0,4};
       // int[] nums={1,0,1,0};
        //int[] nums={3,0,8,2,0,0,1};
      // int[] nums={4,0,4,2,2,0,1,3,3,0,3};
       //System.out.println(canJump(nums));
        //System.out.println(jump(nums));
        System.out.println(jump(nums));

    }

}
