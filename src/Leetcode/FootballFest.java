package Leetcode;

import java.util.Scanner;
import java.util.Stack;

public class FootballFest {
    public static void main(String[] args){
        int ID=-1,countB=0;String prevpass="P";
        Stack stackP=new Stack();
        Stack stackB=new Stack();

        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            ID=s.nextInt();
            stackP.push(ID);
            for(int j=0;j<N;j++){
                String pass=s.next();
                if(pass.charAt(0)=='B'){
                    countB++;
                    if(countB%2==0){
                        ID=(Integer) stackB.pop();
                        stackP.push(ID);
                    }else{
                        int prevID=(Integer) stackP.pop();
                        stackB.push(prevID);
                        ID=(Integer)stackP.peek();
                    }
                    prevpass=pass;

                }else{
                    countB=0;
                    ID=s.nextInt();
                    stackP.push(ID);
                    prevpass=pass;
                }
            }
            System.out.println("Player "+ID);
        }



    }
}
