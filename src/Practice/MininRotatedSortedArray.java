package Practice;

public class MininRotatedSortedArray {
    static int findMin(int[] arr,int start,int end){
       // int n=arr.length;

       // System.out.println("mid is "+mid);
        // int next=(mid+1)%n;int prev=(mid+n-1)%n;
        while(start<=end){
            if(start==end){
                return arr[start];
            }
            while (arr[start]==arr[end]&&start!=end){
                start++;
            }
            int mid=start+(end-start)/2;
            if(arr[mid]<=arr[mid+1] && arr[mid]<=arr[mid-1]){
                return arr[mid];
            }else if(arr[mid]<=arr[end]){
                 end=mid-1;
            }else if(arr[start]<=arr[mid]){
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
       // int[] arr={5,6,7,2,3,4};
       // int[] arr={2,2,2,3,9,2};
        int[] arr={10,34,7,8,9};
        //int[] arr={10,11,22,24,32,54,1,3,3,4,5,6,7,8,9};
        System.out.println(findMin(arr,0,arr.length-1));
    }
}
