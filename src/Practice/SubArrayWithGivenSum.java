package Practice;
//contagious
public class SubArrayWithGivenSum {
    static void sum(int[] arr,int k){


        int sum=arr[0],si=0;
        for(int i=1;i<arr.length;i++){


            if(i<arr.length){

            }
            sum=sum+arr[i];
            while(sum>k&&si<i){
                sum=sum-arr[si];
                si++;
            }
            if(sum==k){
                int ei=i;
                System.out.println("between "+si+" "+ei);
               // return;
                //return 1;
            }

        }
        System.out.println("not found");
        //return 0;
    }

    public static void main(String[] args){
      //  int[] arr={1, 4, 20, 3, 10, 5};
        int[] arr={5,4,3,2};

        int k=33;
        sum(arr,k);

       /* if(si==ei){
            System.out.println("Not possible");
            return;
        }
        for(int i=0;i<=ei;i++){
            if((sum-arr[i])>=k){
                sum=sum-arr[i];
                si=i+1;
            }
        }*/

       // System.out.println("length of the smallest possible subArray is "+ (ei-si+1));
    }
}
