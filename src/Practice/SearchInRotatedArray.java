package Practice;
import java.util.*;
public class SearchInRotatedArray {

        // DO NOT MODIFY THE LIST
        public static int search(final List<Integer> a, int b) {
            int start=0,end=a.size()-1;
            System.out.println("end: "+end+" size is "+a.size());
            while(start<=end){
                int mid=start+(end-start)/2;
                if(a.get(mid)==b){
                        return mid;
                }else if(a.get(start)<a.get(mid)){
                    System.out.println("first is sorted");
                    if(b<=a.get(mid) && b>=a.get(start)){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }else if(a.get(end)>a.get(mid)){
                    System.out.println("second is sorted");
                    if(b>=a.get(mid) && b<=a.get(end)){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
            }
            return -1;
        }

    public static void main(String[] args){
                List<Integer> list= new ArrayList<Integer>(){{
                    add(4);add(5);add(6);add(7);add(0);add(1);add(2);
                }};
        System.out.println(search(list,6));
    }
}
