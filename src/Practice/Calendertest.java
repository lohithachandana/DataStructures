package Practice;
import java.util.*;
//import java.time.*;
public  class Calendertest{

   static String getDay(int m,int d,int y){
     Calendar cal= Calendar.getInstance();
     String[] weekdays= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
     cal.set(y,m-1,d);


 return weekdays[cal.get(Calendar.DAY_OF_WEEK)-1];
 }

 public static void main(String[] args){

   //getDay(8,5,2999);
     System.out.println(getDay(8,5,2999));
 }
}
