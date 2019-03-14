package InterviewQuestions;
import java.util.*;
public class RemoveEvenDuplicatesinString {

static String remove(String in){

    int i=0;
    HashMap<Character,Integer> map= new HashMap<>();
    while(i<in.length()){
        char curr= in.charAt(i);
        if(map.containsKey(curr)){
            int val=map.get(curr);
            map.put(curr,val+1);
        }else{
            map.put(curr,1);
        }
        if(i+1<in.length()&&map.get(curr)>1&&curr!=in.charAt(i+1)){
            if(map.get(curr)%2==0) {
                int len=map.get(curr);
                map.remove(curr);
                String tmp = Character.toString(curr);
                in = in.substring(0, i + 1).replaceAll(tmp, "") + in.substring(i + 1);
                i=i+1-len;
            }else{
                i++;
            }
        }else{
            i++;
        }


    }
    char last=in.charAt(i-1);
    if(map.get(last)%2==0){
        int index=in.length()-map.get(last);
        in=in.substring(0,index);
    }

    if(map.size()==1){
        return "";

    }
    return in;
}

    public static void main(String[] args){
       //String in="azxxzyyyddddyzzz";
        String in="aaaccbbeeecc";
        System.out.println(remove(in));
    }
}
