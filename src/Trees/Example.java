package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Example {
    int[] original=new int[3];
    Scanner in= new Scanner(System.in);
    ArrayList arr=new ArrayList();
    LinkedList check=new LinkedList();


    public void linkedlist(){
        check.add("hg");
        check.add("see");
        check.add("sfg");
        /*while(check.n){

        }*/
    }

    public void addtoList(){
        for(int i=0;i<original.length;i++){
            arr.add(i);
        }
    }

    public void printList(ArrayList input){
        ArrayList output=new ArrayList();
        output.addAll(input);
        for(int i=0;i<original.length;i++){
            System.out.println(output.get(i));
        }

    }


    public  void enterValues(){
        for(int i=0;i<original.length;i++){
            original[i]=in.nextInt();
        }
        in.close();
    }

    public  void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("element at "+i+ " is "+array[i]);
        }
        //System.out.println();
    }
    public static void main(String[] args){
        Example ex=new Example();
        System.out.println("enter Values: \r");
        ex.enterValues();
        ex.print(ex.original);
        ex.addtoList();
        ex.printList(ex.arr);


    }

}
