package InterviewQuestions;

public class PrintCombinations {
    static int count=0;

    static void printCombinations(int[] arr,int n,int i){
       // System.out.println("n: "+n+" "+i+ "index");
      int max=n;
        if(n==0){
            //System.out.println("combination found");
            count++;
          printArray(arr,i);
           return;
        }else if(n>0){

            for(int k=1;k<=max;k++){
                arr[i]=k;
               // i=i+1;
                i++;printCombinations(arr,n-k,i);
            }
        }
    }
    static void printArray(int arr[], int m)
    {
        for (int i = 0; i < m; i++)
            System.out.print(arr[i] + " ");

        System.out.println("");
    }

    public static void main(String[] rag){

        int n=3;int[] steps=new int[n];
        printCombinations(steps,n,0);
        System.out.println(count);
    }

      /*  static void printCompositions(int arr[], int n, int i)
        {
            int MAX_POINT = 3;
            if (n == 0)
            {
                printArray(arr, i);
            }
            else if(n > 0)
            {
                for (int k = 1; k <= MAX_POINT; k++)
                {
                    arr[i]= k;
                    printCompositions(arr, n-k, i+1);
                }
            }
        }

        // Utility function to print array arr[]
        static void printArray(int arr[], int m)
        {
            for (int i = 0; i < m; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }


        // Driver program
        public static void main (String[] args)
        {
            int n = 3;
            int[] arr = new int[n];
            printCompositions(arr, n, 0);
        }*/

}
