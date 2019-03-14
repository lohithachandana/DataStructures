package DailyCoding_CS_DOJO;
/*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/
public class Day2 {

    static int getProduct(int[] arr,int a){
        int out=1;
        for(int i=0;i<arr.length;i++){
            if(i==a){
                continue;
            }
            out=out*arr[i];
        }
        return out;
    }
    static int[] findNewArray(int[] arr){
        int[] out=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            out[i]=getProduct(arr,i);
        }
        return out;
    }

    static int[] findProdOfOthers(int[] arr){
        int n=arr.length,tmp=1;
        int[] prod=new int[n];
        for(int i=0;i<n;i++){
            prod[i]=tmp;
            tmp=tmp*arr[i];
        }
        tmp=1;
        for(int i=n-1;i>=0;i--){
            prod[i]=prod[i]*tmp;
            tmp=tmp*arr[i];

        }
        return prod;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        //int[] arr={3,2,1};
        //int[] out=findNewArray(arr);//O(n2)
        int[] out=findProdOfOthers(arr);//O(n)
        for(int i:out){
            System.out.print(i+" ");
        }
    }
}
