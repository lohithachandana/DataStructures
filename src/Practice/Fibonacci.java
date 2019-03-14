package Practice;

public class Fibonacci {


    static void printfib(int n){
        int prev=0,curr=1;n=10;
        for(int i=0;i<n;i++){
            int sum=prev+curr;

            System.out.println(curr);
            prev=curr;curr=sum;
        }
    }
    static int fibRecur(int n){
        if(n<=1){
            return 1;
        }
        return fibRecur(n-1)+fibRecur(n-2);
    }

    public static void main(String[] ar){

       //printfib(10);//using recursion
        System.out.println(fibRecur(8));
    }
}
