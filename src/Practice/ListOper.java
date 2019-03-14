package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ListOper {

    /*static List<Integer> insert(List<Integer> list, int index, int val){


            }
        }
        return list;
    }
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < N; i++) {
            int temp = scan.nextInt();
            list.add(temp);
        }
        int Q = scan.nextInt();
        for (int q = 0; q < 2*Q; q++){
            String query = scan.nextLine();
            if (query.equals("Insert")) {
                System.out.println("insert query");
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x,y);
            }
            if (query.equals("Delete")) {
                System.out.println("delete query");
                int d = scan.nextInt();
                list.remove(d);
            }
        }
        HashMap<String,Integer> n;
        for (int m : list) {
            System.out.println(m);
        }
    }

}

