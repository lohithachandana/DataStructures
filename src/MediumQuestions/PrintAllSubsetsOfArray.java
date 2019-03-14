package MediumQuestions;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsetsOfArray {

    static void printSubsets(int[] a){
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> tmp= new ArrayList<>();
        getSubsets(list,tmp,a,0);
        list.add(new ArrayList<>());
        System.out.println("list is "+list);
    }
    static void getSubsets( List<List<Integer>> list,List<Integer> tmp,int[] a,int index){
        if(index>=a.length){
            return;
        }
        int prev=-1;
        for(int i=index;i<a.length;i++){
            if(a[i]!=prev) {

                tmp.add(a[i]);
                list.add(new ArrayList<>(tmp));
                getSubsets(list, tmp, a, i + 1);
                tmp.remove(tmp.size() - 1);
               prev = a[i];
          }
        }
    }

    public static void main(String[] args){
        int[] a={1,2,2,3};
        printSubsets(a);
    }
}
