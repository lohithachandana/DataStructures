package InterviewQuestions;
//TravellingIsFun
import java.util.*;
public class SwiggyCodingChallenge {


  /*  static int gcd(int n1,int n2){
        // List<Integer> list= new ArrayList<>();
        System.out.print(" for "+n1+" "+n2);
        while(n1 != n2){
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println(" - "+n1+" is the gcd");
        return n1;
    }


    public static List<Integer> getConnectedCities(int[] originCities, int[] destinationCities,int g) {
        // Write your code here

        List<Integer> res= new ArrayList<>(originCities.length);
        for(int i=0;i<originCities.length;i++){
            if(gcd(originCities[i],destinationCities[i])>g){
                res.add(1);
            }else{
                res.add(0);
            }
        }
        return res;
    }*/



    public static void main(String[] args){
        int[] origin={10,4,3,6};//{1,2,4,6};
        int[] dest={3,6,2,9};//{3,3,3,4};

       // List<Integer> list=getConnectedCities(origin,dest,1);
    }

/*
class Result {

    /*
     * Complete the 'connectedCities' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER g
     *  3. INTEGER_ARRAY originCities
     *  4. INTEGER_ARRAY destinationCities
     */

    static int gcd(int n1,int n2){
        // List<Integer> list= new ArrayList<>();

        while(n1 != n2){
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }

        return n1;
    }


    public static List<Integer> connectedCities(int n, int g, List<Integer> originCities, List<Integer> destinationCities) {
        // Write your code here
        LinkedList<Integer> graph[]= new LinkedList[n];
        for(int i=0;i<n;i++){
            graph[i]= new LinkedList();
        }
        HashSet<Integer> set= new HashSet<>();
        List<Integer> res= new ArrayList<>(originCities.size());
        for(int i=0;i<originCities.size();i++){
            set.add(originCities.get(i));
            set.add(destinationCities.get(i));
        }
        for(Integer num: set){
            int curr=num;
            for(Integer tmp:set){
                if(tmp!=curr && gcd(tmp,curr)>g){
                    graph[curr-1].add(tmp);
                }
            }
        }
        int oldSize=0;
        for(int i=0;i<originCities.size();i++){
            Iterator<Integer> it = graph[originCities.get(i)-1].iterator();

            while(it.hasNext()){
                int city=it.next();
                if(city==destinationCities.get(i)){
                    oldSize++;
                    res.add(1);break;

                }
            }
            if(res.size()==0 || res.size()<oldSize){
                res.add(0);
            }

        }
        return res;
    }

}


