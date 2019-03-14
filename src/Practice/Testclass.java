package Practice;






/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    static boolean isLess(int[] in,int k){
        for(int i=0;i<in.length;i++){

            if(in[i]<k){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("ENter no. of testcases");
        int T=s.nextInt();

            for(int i=1;i<=T;i++){
                int N=s.nextInt();
                int K=s.nextInt();
                int[] arr=new int[N];
                for(int j=0;j<N;j++){
                    arr[j]=s.nextInt();
                }
                int time=0;
                while(isLess(arr,K)){
                    for(int k=0;k<N;k++){
                        arr[k]++;
                    }
                    time++;
                }
                System.out.print(time+"\n");
            }





        // Writing output to STDOUT



        // Write your code here

    }
}
