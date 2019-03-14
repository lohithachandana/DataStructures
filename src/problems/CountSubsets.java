package problems;
import java.util.*;
public class CountSubsets {

    public static int count=0;
    static int countSubSequence(List<Integer> nums, int k) {


        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
    public static void main(String[] args){
        List<Integer> list= new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(null);
        list.add(1);
        list.add(4);
        list.get(-1);
      //  System.out.println(list.get(2) == null);
        //int currBal= 8 + (list.get(2) != null ? list.get(2) : 0);
        //System.out.println(countSubSequence(list,5));

    }
}
