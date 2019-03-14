package InterviewQuestions;
import java.util.*;
public class FizzBuzz {


    /* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail



        public static void printNums(int num){

                boolean flag1=true,flag=true;
                for(int i=1;i<=num;i++){
                    if(i%3==0 && i%5==0){
                        System.out.println("FizzBuzz");
                        flag1=false;
                        flag=false;
                    }

                    if(i%3==0 && flag1){
                        flag=false;
                        System.out.println("Fizz");
                    }
                    if(i%5==0 && flag1){
                        flag=false;
                        System.out.println("Buzz");
                    }
                    if(flag){
                        System.out.println(i);
                    }
                    flag=true;
                    flag1=true;

            }
        }
        public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
            //Scanner
            System.out.println("Enter no. of testcases");
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();               // Reading input from STDIN
            int[] inputArr= new int[T];
            for(int i=0;i<T;i++){
                System.out.println("Enter "+(i+1)+"th interger");
                int in = s.nextInt();
                inputArr[i]=in;
            }
            for(int i=0;i<inputArr.length;i++){
                printNums(inputArr[i]);
            }





            // Write your code here

        }
    }


