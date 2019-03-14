package Test;


import java.util.Scanner;

public class TestClass {
    int getPrice(int[] in,int p){
        int price=0;
        int N=in.length;
        for(int i=0;i<=N;i++){
            if((i+1)<N) {
                int diff = in[i] - in[i + 1];
                if (diff < 0) {
                    price = price + (p * (Math.abs(diff)));
                } else {
                    price = price - (p * (Math.abs(diff)));
                }
            }
        }
        return price;

    }
    static boolean fix(boolean b1){
        b1=true;
        return b1;
    }
    public static void main(String[] args){
        Integer i=0,j=0;
        for(short k=0;k<5;k++){
            if((++i>3)||(++j>3)){
                i++;
            }
        }
        System.out.println(i+"che");

        //char letterN=\u004E;
        int index=0;

       // Scanner s=new Scanner(System.in);
        //int T=s.nextInt();
        //int[] res=new int[T];
       /* for(int i=1;i<=T;i++){
            int N=s.nextInt();
            int P=s.nextInt();
            int[] arr=new int[N+1];
            arr[0]=0;
            for(int j=1;j<=N;j++){

                arr[j]=s.nextInt();
            }
            TestClass obj=new TestClass();
            int amount=obj.getPrice(arr,P);
           // System.out.println(amount);

        }*/
       /* for(int i=0;i<index;i++){
            System.out.println(res[i]);
        }*/
    }
}
