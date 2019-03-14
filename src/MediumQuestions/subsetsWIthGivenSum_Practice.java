package MediumQuestions;

import java.util.ArrayList;
import java.util.List;

public class subsetsWIthGivenSum_Practice {

    static void printSubsetsforSumK(int[] a,int k){
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> tmp= new ArrayList<>();
        getSubsets(list,tmp,a,0,k);
        System.out.println(list);
    }

    static void getSubsets(List<List<Integer>> list,List<Integer> tmp,int[] a,int index,int k){
        if(k<0){
            return;
        }
        if(k==0){
            list.add(new ArrayList<>(tmp));
            return;
        }
        int prev=-1;
        for(int i=index;i<a.length;i++){
           // if(prev!=a[i]){
                tmp.add(a[i]);
                getSubsets(list,tmp,a,i+1,k-a[i]);
                tmp.remove(tmp.size()-1);
                //prev=a[i];
            //}

        }
    }
    public static void main(String[] args){
        //int[] a={1,4,3,2,6,5,9,8};int k=12;
        //int[] a={2,3,6,7};int k=7;
        int[] a={1,3,9,2};int k=5;
        printSubsetsforSumK(a,k);
    }
}
