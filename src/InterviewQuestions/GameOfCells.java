package InterviewQuestions;
import java.util.*;

public class GameOfCells {


    static int max(List<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i:list){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    static int jumpGame(int n,int k,int[] A,int[] B){
        List<Integer> A1= new ArrayList<>();
        List<Integer> B1= new ArrayList<>();

        int i=-1;
        while(i<n){

            i=i+k;
            if(i>=n){
                break;
            }
            A1.add(A[i]);
            B1.add(B[i]);
        }
        return max(A1)*max(B1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        int k =  scan.nextInt();


        int[] A=new int[n];

        int[] B=new int[n];


        for(int i=0;i<n;i++){
           A[i]= scan.nextInt();
           B[i]=scan.nextInt();
        }

        System.out.println(jumpGame(n,k,A,B));

    }
}
