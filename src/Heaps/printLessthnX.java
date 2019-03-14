package Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class printLessthnX {
    private static void printLessthnX(int[] in,int x){
        for(int i=0;i<in.length;i++){
            if(in[i]<x){
                System.out.println(in[i]);
            }
        }
    }
    public static void main(String[] args){
        int arr[]={2,3,15,5,4,45,80,6,15,17,120};
        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        printLessthnX(arr,x);
        PriorityQueue pq=new PriorityQueue();
    }
}
