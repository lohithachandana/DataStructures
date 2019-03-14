package ll;

import java.util.HashMap;

public class IntersectionPoint {

    public static void findpoint(Node head,Node head1) {
        HashMap<Node, Boolean> map = new HashMap<Node, Boolean>();
        while (head != null) {
            map.put(head, true);
            head = head.next;

        }
        while (head1 != null) {
            if (map.containsKey(head1)) {
                System.out.println("intersection point is "+ head1.data);
                break;
               // return head1;
            }

            head1 = head1.next;
        }
    }

    public static void main(String[] args){
        Node head = new Node(10);
        Node a = new Node(19);
        Node b = new Node(20);
        Node c = new Node(28);
        Node d = new Node(8);
        Node e = new Node(81);

            Node head1 = new Node(11);
            Node a1 = new Node(13);
            Node b1 = new Node(24);


            head.next = a;
            a.next = b;
            b.next = c;

            head1.next = a1;
            a1.next = b1;
            b1.next = c;

            c.next = d;
            d.next=e;


            findpoint(head,head1);


    }
}
