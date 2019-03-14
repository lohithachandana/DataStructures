package Leetcode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ArrayListHackRank {
    static void print(int[] list,int x,int y){
        for(int i:list){
            if(i==(y-1)){
                System.out.println(list[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        ArrayList<int[]> list=new ArrayList<int[]>();
        for(int i=0;i<n;i++){
            int d=scan.nextInt();
            int[] arr=new int[d];
            if(d>0){
                for(int j=0;j<d;j++){
                    arr[j]=scan.nextInt();
                }
            }
            list.add(arr);
        }
        int q=scan.nextInt();
        for(int i=0;i<q;i++){
            int x=scan.nextInt();
            int y=scan.nextInt();
            int[] temp=list.get(x-1);
            print(temp,x,y);
        }





    }
}