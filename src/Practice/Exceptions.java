package Practice;


import java.lang.annotation.IncompleteAnnotationException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Exceptions {

    int divide(int x,int y) {
     /*   long res=0;
        if (x < 0 || y < 0 || x == 0 || y == 0) {
           // throw new Exception("negatives or zeroes not allowed");
        }

             res = (long)Math.pow(x,y);
*/
        try {
            int ans = x / y;
            if(x<0 || y<0 || x==0 || y==0){
                throw new Exception("negatives or zeroes not allowed");
            }
            //System.out.println("ans is: "+ans);
            return 0;
        }
        catch(Exception e){
         //   System.out.println(e);
            return 1;
        }finally {
            return 2;
        }

     //   return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer>[] arr;
        System.out.println(test());
    }

    public static int test() {
        try {
            int x=9/0;
            return 0;

        }catch (Exception e){
            System.out.println("entered caught");
return 1;
        }
        finally {
            System.out.println("finally trumps return.");
            return 2;
        }
    }
    }