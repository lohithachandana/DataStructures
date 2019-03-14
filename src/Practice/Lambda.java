package Practice;
import java.io.*;
import java.util.*;
import java.util.function.Consumer;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd(){
        PerformOperation p= (int x)-> {
            if (x % 2 == 0)
                return false;
            else
                return true; };

        return p;
    }

    PerformOperation isPrime(){
        PerformOperation p= (int x)-> {
            for(int i=2;i<x;i++){
                if (x % i == 0)
                    return false;

            }
            return true;
        };
        return p;
    }

    PerformOperation isPalindrome(){
        PerformOperation p= (int x)-> {
            String s= Integer.toString(x);
            String tmp="";
            for(int i=s.length()-1;i>=0;i--){
                tmp=tmp+s.charAt(i);
            }
            if(tmp.contains(s))
                return true;
            else
                return false;  };

        return p;
    }
}





public class Lambda {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
