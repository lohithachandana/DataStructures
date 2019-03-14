package Leetcode;

public class RemoveElement {
    static void rotate(int[] in){
        int tmp=in[0];int i;
        for(i=1;i< in.length;i++){
            int j=i-1;
            in[j]=in[i];
        }
        in[i-1]=tmp;
    }

     int removeElement(int[] nums,int k){
        int count=0;
        int len,temp;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==k) {
                count++;
            }
        }
        len=n-count;
       // for(int i=0;i<len;i++){
        int j=0;
         while(true){
             if(j==len){
                 break;
             }
            if(nums[j]==k){
                temp=nums[0];
                nums[0]=nums[j];
                nums[j]=temp;
                rotate(nums);
            }else{
                j++;
            }

         }
       // len=n-count;
        return len;
    }
    public static void main(String[] args){
        //int[] arr={0,1,2,2,3,0,4,2};
        int[] arr={0,4,4,0,4,4,4,0,2};

        int value=4;
        RemoveElement e=new RemoveElement();
        int len=e.removeElement(arr,value);
        //rotate(arr);
        for (int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }
}
