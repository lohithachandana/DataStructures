package Test;
import java.util.*;
public class Check {
    static long xor(long a,long b){
        return (a|b)&(~a|~b);
    }

        static long[] findsol(long y, long x) {
            // long[] res= new long[2];res[0]=-1;
            Map<Long,Long> ans=new TreeMap<>();
            for(long i=0;i<=x;i++){
                long add=x-i;
                if(xor(i,add)==y){
                    ans.put(i,add);
                    // res[0]=i;
                    // res[1]=add;
                }
            }
            if(ans.size()>0){
                long[] res=new long[2];
                Set<Map.Entry<Long,Long>> entry= ans.entrySet();
                for(Map.Entry<Long,Long> e:entry) {
                    res[0]=e.getKey();res[1]=e.getValue();
                    break;
                }
                return  res;
            }else {
                long[] res = {-1};
                return res;
            }

        }

    public static void main(String[] ar){

       long[] check= findsol(2,4);
        System.out.println(check[0]+" "+check[1]);
    }
}
