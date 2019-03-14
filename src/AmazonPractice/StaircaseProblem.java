package AmazonPractice;

public class StaircaseProblem {
    static int count;
    static void possibleWays(int[] ways,int[] a,int N,int index){

        if(N==0){
            count++;
            for(int j=0;j<index;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println("");
        }

        if(index>=a.length || N<0){
            return;
        }
        //int index=0;
        /*for(int i=0;i<ways.length;i++){
            a[index]=ways[i];
            possibleWays(ways,a,N-ways[i],index+1);
        }*/
        for(int i=1;i<=4;i++){
            a[index]=i;
            possibleWays(ways,a,N-i,index+1);
        }
    }

    public static void main(String[] args){
        int N=4;
        int[] arr= new int[N];
        int[] ways={1,2,3,4};
        possibleWays(ways,arr,N,0);
        System.out.println("There are "+count+" possible ways");
    }
}
