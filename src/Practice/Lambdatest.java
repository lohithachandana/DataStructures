package Practice;


import static java.lang.Math.ceil;

interface Billing{
    void getBill(double price);
}
public class Lambdatest {
  /*  public void getBill(double price){
        double tax= 0.05*price;
        double bill= price+tax;
        bill=ceil(bill);
        System.out.println(bill);

    }*/
   static double getPrice(String item){
        double price=0;
        if(item=="Burger"){
            price=4.67;
            return price;
        }
        if(item=="pizza"){
            price=10.32;
            return price;
        }
        return price;
    }
    public static void main(String[] a){

       Billing obj=(p)->{
            double tax= 0.05*p;
            double bill= p+tax;
            bill=ceil(bill);
            System.out.println(bill);
        };
        obj.getBill(getPrice("pizza"));

    }
}
