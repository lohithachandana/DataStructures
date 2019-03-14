package queues;

public class Rearrange {
    public static void main(String[] args){

        basic half2=new basic();
        basic half1=new basic();
        basic main=new basic();
        main.enqueue(11);
        main.enqueue(12);
        main.enqueue(13);
        main.enqueue(14);
        main.enqueue(15);
        main.enqueue(16);
        main.enqueue(17);
        main.enqueue(18);
        main.enqueue(19);
        main.enqueue(20);
        int halfsize = main.size()/2;
        for(int i=0;i<halfsize;i++){
            half1.enqueue(main.dequeue());
        }

        for(int i=0;i<halfsize;i++){
            half2.enqueue(half1.dequeue());
            half2.enqueue(main.dequeue());
        }


        for(int i= half2.front;i<=half2.rear;i++){
            System.out.println(half2.a[i]);
        }


        System.out.println("half2 is");



    }
}
