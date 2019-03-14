package ll;

public class mergeSort {
    public static Node merge(Node head,Node head1){
        Node newN= new Node(0);

        if(head==null){

            return head1;
        }
        if(head1==null){

            return head;
        }
        if(head.data<head1.data){
            newN=head;
           newN.next= merge(head.next,head1);
        }else{
            newN=head1;
            newN.next= merge(head,head1.next);
        }
        return newN;

    }
    public static void main(String[] args){
        Node head = new Node(10);
        Node a = new Node(19);
        Node b = new Node(20);
        Node c = new Node(28);
        Node d = new Node(35);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        Node head1 = new Node(1);
        Node a1 = new Node(9);
        Node b1 = new Node(21);
        Node c1 = new Node(23);
        Node d1 = new Node(31);

        head1.next = a1;
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        Node merge=merge(head,head1);
        while(merge!=null){
            System.out.println(merge.data);
            merge=merge.next;

        }
    }
}
