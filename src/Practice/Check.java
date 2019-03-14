package Practice;

import java.util.*;

 /*class sortby2nd implements Comparator{

     int compare(int x,int y){
        if(x==y){
            return 0;
        }

            return x>y?1:-1;
    }
}*/
//Write your code here

public class Check {
public static void main(int[] args){
    System.out.println("main check");
}

    public static  void main(String[] args) {
//      Integer a12=null;int b12=a12;
       // System.out.println(b12);
        int u=2;
        while(u++>10);
        u++;
        System.out.println(u+" gfg");

        //int x=3,y=5;
        System.out.println(" cehck cek");
        int[] bo={3,4,2,4,3,2,2};
        //int bmn=bo;
        Arrays.sort(bo);
        System.out.println("fiest e"+ bo[0]);



        ArrayList<double[]> list= new ArrayList<double[]>();
        double[] arr1={2.2,6.7,3.3};
        double[] arr2={2.1,6.3,3.2};
        double[] arr3={1.5,7.6,3.6};

        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        double[] tmp44=list.get(0);
             for(double i:tmp44){
                 System.out.println(i+" elements");
             }



        //Sort sort;
       // Collections.sort(list,new sortby2nd());



        Integer [] tmp={1, 23, 12, 9, 30, 2, 50};
            // Arrays.s
        Arrays.sort(tmp,Collections.reverseOrder());
        ArrayList<Integer> arrL=new ArrayList<Integer>();
        ArrayList<Arrays> list2= new ArrayList<Arrays>();
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.add(6);
        Collections.sort(arrL);
        // pritnall elements using for each loop
        System.out.println("printed usind for each loop");
        for(Integer i:arrL){
            System.out.println(i+" ");
        }
        System.out.println();
        Scanner scan=new Scanner(System.in);


        System.out.println("Reverse order is ");
        for(int i=0;i<3;i++){
            System.out.println(tmp[i]);
        }




        List fruits = new ArrayList();
        Collections.addAll(fruits, "Apples", "Oranges", "Banana");
        System.out.println("collection example and the list is ");

        int x=54000000;
        x=(10*x+1);
        System.out.println("num is "+ x);

        //fruits.forEach(n-> System.out.println(n));
        //fruits.forEach(System.out::println);


        /* lambda expression to print all elements of arrayList
        arrL.forEach(n-> System.out.println(n+" from arrayList" ));
            */
       /* int[] temp = new int[12];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0, j = 4 * i; j < 4 * (i + 1); k++, j++) {
                System.out.println(i + " = i " + j + " =j ");
                temp[j] = arr[i][k];
            }
        }*/
        //heapify(temp,i,temp.length);
      //  sort();
        String A="java";
        String B="java";

        System.out.println("given string: "+A+" len is "+A.length());
//char a=A.charAt(0);
       // A.charAt(0)=Character.toString(A.charAt(0)).toUpperCase().charAt(0);
        String tmp1= Character.toString(A.charAt(0));
        String tmp2= Character.toString(B.charAt(0));
       String out= tmp1.toUpperCase().concat(A.substring(1));
        char a = A.charAt(0);
        char b = B.charAt(0);
        int ascia = (int) a;
        int ascib = (int)b;
        if(ascia<ascib || ascia==ascib){
            System.out.println("no");
        }else
            System.out.println("yes");


    }
}
