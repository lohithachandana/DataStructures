package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Esko_UnitBalancer {

static String getSmallest(String[] name,ArrayList<String[]> eq){
   // boolean matches =true;
    HashMap<String,Boolean> map=new HashMap<String,Boolean>();
        for(int j=0;j<eq.size();j++){
            String[] tmp= eq.get(j);
            map.put(tmp[0],true);
        }
        for(int i=0;i<name.length;i++) {
            if(map.containsKey(name[i])){

            }else{
                return name[i];
            }


        }

    return name[name.length-1];
}


    static String getGreatest(String[] name,ArrayList<String[]> eq){
        HashMap<String,Boolean> map=new HashMap<String,Boolean>();
        for(int j=0;j<eq.size();j++){
            String[] tmp= eq.get(j);
            map.put(tmp[tmp.length-1],true);
        }
        for(int i=0;i<name.length;i++) {
            if(map.containsKey(name[i])){

            }else{
                return name[i];
            }
        }
        return name[name.length-1];
    }

    static String findNext(String in,ArrayList<String[]> eq,int[] integers,int index ){
        HashMap<String,String> map=new HashMap<String,String>();
        for(int j=0;j<eq.size();j++) {
            String[] tmp = eq.get(j);
            map.put(tmp[0], tmp[2]+" "+tmp[tmp.length - 1]);
        }
        if(map.containsKey(in)){
            String out=map.get(in);
            //System.out.println(out);
            String out1[]= out.split(" ");

            integers[index]=Integer.parseInt(out1[0]);
            return out1[1];
        }
        return in;
    }

    static void print(String[] order, int[] integers){
        System.out.print(integers[0]+order[0]+" "+"=");
        //System.out.println();

        for(int m=1;m<order.length;m++){
            if(m+1==order.length) {
                System.out.print((integers[m]*integers[m-1])+order[m]);
            }else{
                //String out=(integers[m]*integers[m-1])+order[m];
                System.out.print((integers[m]*integers[m-1])+order[m]+" "+"="+"");//+"="+" ");
               // System.out.println("");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] name= scan.nextLine().split(",");
        String[] order= new String[name.length];
        int eqNum=name.length-1;
        String[] temp=new String[eqNum];
        int[] integers=new int[eqNum+1];
        integers[0]=1;
        ArrayList<String[]> equation=new ArrayList<String[]>();

        for(int i=0;i<eqNum;i++){
            temp= scan.nextLine().split(" ");
            equation.add(temp);
        }

       // System.out.println(equation);
        String s=getSmallest(name,equation);
        String greatest= getGreatest(name,equation);
       // System.out.println("s: "+s+" l: "+greatest);

        order[0]=greatest;

        for(int m=1;m<name.length;m++){
                    order[m]=findNext(order[m-1],equation,integers,m);
        }

        print(order,integers);
    }
}
