package Practice;

import java.util.*;

// GENERICS is the idea to provide type for classes,methods,interfaces

  //class container of type T, which can be anything when the instancecis crated
class Container<T>{
     T value;
     public void show(){
         System.out.println(value.getClass().getSimpleName());
     }
}
class Student{
    int rollno,marks;
    public Student(int rollno,int marks){
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
public class GenericsTest {

    public static void main(String[] args){
        int[] arr={1,5,4,3,2};

        int[] ar=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(arr);
        System.out.println(ar[arr.length-1]);
        System.out.println(arr[arr.length-1]);

        List<Student> students= new ArrayList();
        students.add(new Student(3,56));
        students.add(new Student(2,67));
        students.add(new Student(5,74));
        students.add(new Student(4,88));
        students.add(new Student(1,96));


        Comparator<Student> check2 = (o1,o2)->{
            if(o1.marks>o1.marks){
                return 1;
            }
            return -1;


        };
       // students.forEach((i)-> System.out.println(i));
        Collections.sort(students,check2);




        ArrayList val= new ArrayList();
        val.add(208);
        val.add(444);
        val.add(188);
        val.add(221);
        val.add(509);
        //System.out.println(v.add("dg"));
        Comparator<Integer> check = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10) {
                    return 1;
                }else{
                    return -1;
                }

            }
        };

       // Collections.sort(val,check);
       // val.forEach((i)-> System.out.println(i));
      //  val.forEach(System.out::println);
       /* for(Object i:val){
            System.out.println(i);
        }*/
        Container<Integer> obj=new Container<>();
        obj.value=9;
      //  obj.show();


       // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new HashSet<>();
        //Set<Integer> set = new TreeSet<>();
       // Map<Integer,String> set = new HashMap<>();
        set.add(5);
        set.add(74);
        set.add(2);
        set.add(45);
        set.add(null);
       // val.parallelStream().forEach(System.out::println);
    }
}
