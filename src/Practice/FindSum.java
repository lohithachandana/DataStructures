package Practice;

import java.util.HashMap;

public class FindSum {
    static boolean exists(int[] arr,int X){
        int n=arr.length;
        HashMap<Integer,Boolean> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int required= X-arr[i];
            if(map.containsKey(required)){
                return true;
            }else{
                map.put(arr[i],true);
            }
        }
        return false;
    }

    public static void main(String[] args){
         int[] input={4,1,7,2,3};
         int sum=11;
      // System.out.println(exists(input,sum));


        // checking the relation between String objects
        /* String c="chandu";
         String e="Eq";
        System.out.println(c.hashCode()+" "+e.hashCode());
         String d= new String("chandu").intern();
         if(c.equals(e)){
             System.out.println("checks content");
         }
         if(c==d){
             System.out.println("same object");
         }else{
             System.out.println("diff objects");
         }
         if(c.hashCode()==e.hashCode()){
             System.out.println("same address");
         }else{
             System.out.println("diffAdrress");
         }*/

/*        String s1="abc";
        String s2=s1;
        s1.concat("d");
        System.out.println(s1+" "+s2+" "+(s1==s2));
        StringBuffer sb1= new StringBuffer("abc");
        StringBuffer sb2=sb1;
        sb1.append("d");
        System.out.println(sb1+" "+sb2+" "+(sb1==sb2));*/

    }
}
