package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearchFirstnLastOccurence {
    static int findTarget(int[] arr,int start,int end,int t,boolean first){
       int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==t){
                result=mid;
                if(first){
                    end=mid-1;
                }else {
                    start = mid + 1;
                    System.out.println("new start "+start+" end is "+end);
                }
            }
            if(arr[mid]<t){
                start=mid+1;
            }else if(arr[mid]>t){
                end=mid-1;
            }
        }

       return result;
    }


    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {

        int[] arr = new int[a.size()];

        // ArrayList to Array Conversion
        for (int i =0; i < a.size(); i++)
            arr[i] = a.get(i);

        ArrayList<Integer> res= new ArrayList<>();
       // int first= findTarget(arr,0,arr.length-1,b,true);
        int last=findTarget(arr,0,arr.length-1,b,false);
        //res.add(first);
        res.add(last);
        return res;



    }

    public static void main(String[] args){
       // int[] arr={5, 7, 7, 8, 8, 10};
       // int[] arr={ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int[] arr={10,10,10,10,10,10,10};
        BinarySearchFirstnLastOccurence obj=new BinarySearchFirstnLastOccurence();
        List<Integer> check = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> res=obj.searchRange(check,10);
        System.out.println(res.toString());
    }
}
