package Leetcode;

import java.util.*;


public class RevreseInt {
    public static int reverse(int x) {
        int rev = 0;
        int prev=0;
        while(x != 0){
            int lastdigit=x%10;
            rev = rev*10 + lastdigit;
            //System.out.println("new rev is "+rev+" last digit "+lastdigit+" prev_rev "+prev+" curr x:"+x);
            if((rev-lastdigit)/10!=prev){
                System.out.println(" overflows!! ");
                return 0;
            }
            prev=rev;
            x = x/10;// send the same num without lastdigit
        }

        return rev;
    }

    public static void main(String[] args) {

        int x=Integer.MAX_VALUE;
        System.out.println("Reversed List is "+reverse(x));


    }

}

