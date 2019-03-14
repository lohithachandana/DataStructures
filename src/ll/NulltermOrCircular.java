package ll;

public class NulltermOrCircular {
    public static void main(String[] args){

        Node head = new Node(1);
        Node a= new Node(2);
        Node v= new Node(11);
        Node x= new Node(12);
        Node b= new Node(3);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);
Node f= new Node(7);
Node g= new Node(8);
Node i= new Node(9);
head.next=a;
a.next=v;
v.next=x;
        x.next=b;
        b.next=c;
        c.next=d;
        d.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=i;
        i.next=v;
        Node sp=head;
        Node fp=head;
        int size=0;
        while(fp!=null){
            fp=fp.next.next;
            sp=sp.next;
            if(sp==fp){
                System.out.println("looped");
break;
            }
        }
do{sp=sp.next;
            size=size+1;
}while(sp!=fp);
        System.out.println("size is "+ size);

//        Node check= head;
//        while(check!=null){
//            check=check.next;
//
//    }
//    System.out.println("null terminated");
   //     Node check2=head;
     //   Node headN=head;
       // while(check2!=null){
         //   check2=check2.next;
           // if(check2==headN){
             //   System.out.println("looped");
            //   // break;
            //}
        //}
        //if(check2==headN){
          //  System.out.println(headN.data);
        //}
        //System.out.println("circular list");
}



}
