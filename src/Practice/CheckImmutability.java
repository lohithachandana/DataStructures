package Practice;

 final class Immutability {
    private final int name;
    Immutability(int name){
        this.name=name;
    }
    int getName(){
        return this.name;
    }

}

public class CheckImmutability{
    public static void main(String[] args){
        Immutability obj1= new Immutability(4);
        System.out.println(obj1.getName());
        //obj1.getName().
        //obj1=new Immutability("chandu");
        System.out.println(obj1.getName());


    }

}
