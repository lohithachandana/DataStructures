package Practice;

import java.util.HashMap;

public class OccurencesInArray {

    public static void main(String[] args){
        int[] arr={2,1,3,4,5,2,4,4,3,4,5,5,3};
        int count=0,g=0;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                count=map.get(arr[i]);
                int newCount=count+1;
                map.replace(arr[i],count,newCount);
            }else{
                count++;
                map.put(arr[i],count);
            }
            count=0;
        }
        int val=map.size();int[] values= new int[val];
      //  map.forEach((k,v)->values[g]=v));
//System.out.println(k+" is repeated for "+v+" times"
    }
}
