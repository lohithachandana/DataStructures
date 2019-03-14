package InterviewQuestions;

import Leetcode.ArrayListHackRank;


import java.util.*;

public class Overlaps {

    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        List<List<Integer>> time=new ArrayList<>();
        int n=5;
         for(int i=0;i<n;i++){
             int st=scan.nextInt();
             int et=scan.nextInt();
             List<Integer> tmp= new ArrayList<>();
             tmp.add(st);tmp.add(et);
             time.add(tmp);
         }

        Map<Integer,Integer> prev=new Hashtable<>();
        int count=0,prevCount=0;
         for(List<Integer> t:time) {
             int st = t.get(0), et = t.get(1);
             if ((prev.containsKey(et)) || (prev.containsValue(st))|| (prev.containsKey(st))|| (prev.containsValue(et))) {

             }else if(prev.size()==0){
                 prev.put(st,et);
             } else{

                 Set<Map.Entry<Integer, Integer>> entry = prev.entrySet();
                 for (Map.Entry<Integer, Integer> e1 : entry) {

                     if ((st >= e1.getKey() && st <= e1.getValue()) || (et >= e1.getKey() && et <= e1.getValue())) {
                     } else {
                         count++;//count is increased when the curr event timings dont overlap
                     }
                 }
                 if(count>prevCount){
                     prev.put(st,et);
                 }
                 prevCount=count;
             }

         }


        System.out.println(prev.size());
    }
}
