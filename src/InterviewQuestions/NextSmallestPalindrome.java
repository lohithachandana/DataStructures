package InterviewQuestions;

import java.util.*;
public class NextSmallestPalindrome {

        static String output="";

        static void nextPlaindrome(int[] num){
            int len=num.length;
            int mid=len/2;
            int i=mid-1;
            int j=0;
            if(len%2==0){
                j=mid;
            }else{
                j=mid+1;
            }
            boolean leftPartisLess=false;
            while (i >= 0 && num[i] == num[j])
            {   i--;
                j++;
            }
            if(i<0 || num[i]<num[j]){
                leftPartisLess=true;
            }
            while(i>=0){
                num[j++]=num[i--];
            }

            if(leftPartisLess){
                int carry = 1;
                if (len % 2 == 1) {
                    num[mid] += 1;
                    carry = num[mid] / 10;
                    num[mid] %= 10;
                }
                i = mid - 1;
                j = (len % 2 == 0 ? mid : mid + 1);

                while (i >= 0)
                {
                    //char carryChar=(char)carry;
                    num[i] = num[i] + carry;
                    carry = num[i] / 10;
                    num[i] %= 10;
                    num[j] = num[i];
                    i--;
                    j++;
                }
            }
            for(int n1:num) {
                System.out.println(n1);
            }
        }

        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            int num= scan.nextInt();
            String n=Integer.toString(num);
            int[] nums= new int[n.length()];
            //int numCopy=num;
            for(int i=nums.length-1;i>=0;i--){
                nums[i]=num%10;
                num=num/10;
            }
            nextPlaindrome(nums);

        }

    }




