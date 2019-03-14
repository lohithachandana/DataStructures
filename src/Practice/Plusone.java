package Practice;

import java.util.Arrays;

public class Plusone {
    static int[] plusOne(int[] nums){
        //gives number format exception
       /* String num="";
        for(int i: nums){
            num=num+i;
        }
        int tmp=Integer.parseInt(num)+1;
        num=Integer.toString(tmp);
        System.out.println(num+" check num");
        String[] out=num.split("");
        int[] res=new int[out.length];
        int index=0;
        for(String i: out){
            res[index]=Integer.parseInt(i);
            index++;
        }
        return  res*/;

        int n=nums.length,carry=0;int sum=0;
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                sum=nums[i]+1+carry;
            }else{
                sum=nums[i]+carry;
            }

            if(sum>=10){
                carry=sum/10;
                sum=sum%10;
            }
            nums[i]=sum;
        }
        if (carry>0) {
            int[] res = new int[nums.length + 1];
            res[0]=carry;
            System.arraycopy(nums,0,res,1,n);
            return res;
        }else
            return nums;
    }
    public static void main(String[] args){
       // int[] nums={9,8,7,6,5,4,3,2,1,0};
        int[] nums={9};
        int[] res= plusOne(nums);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
