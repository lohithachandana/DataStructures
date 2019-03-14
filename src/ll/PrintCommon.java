package ll;

public class PrintCommon {
    //private static Node node;

    public static Node print(Node temp1,Node temp2){

        Node head3=null, temp = null;
        //Node head3=null,temp3=null;

        while(temp1!=null&& temp2!=null){
               if(temp1.data==temp2.data){

                   //temp3=new Node(temp1.data);
                   //Node temp3=new Node(temp1.data);
                   Node node =new Node(temp1.data);

                   if(head3 == null){
                       //head3 = temp3;
                       //node=head3;
                       head3 = node;
                       temp = node;
                   } else {
                       temp.next = node;
                       temp = temp.next;
                       //head3.next=temp3;
                       //head3=head3.next;

                   }

                   temp1=temp1.next;
                   temp2=temp2.next;

               }else if(temp1.data>temp2.data) {

                    temp2=temp2.next;
               }else
                   temp1=temp1.next;
        }

        return head3;
    }



    public static void main(String[] args){
        Node head = new Node(2);
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(9);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        Node head1 = new Node(1);
        Node a1 = new Node(2);
        Node b1 = new Node(3);
        Node c1 = new Node(5);
        Node d1 = new Node(6);
        Node e1= new Node(9);

        head1.next = a1;
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next=e1;

        Node inter=print(head,head1);
        while(inter!=null){
            System.out.println(inter.data);
            inter=inter.next;
        }
        System.out.println("is the intersection linkedlist");

    }

}
