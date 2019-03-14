package ll;

public class ReverseList {
    public static void reverse(Node head){
        Node prev=null;
        Node next;
        while(head!=null){
            if(head.next==null){
                head.next=prev;
                break;
            }
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void printReverse(Node node){
        if(node.next!=null){
            printReverse(node.next);
        }
        System.out.println(node.data);

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
        reverse(head);
        //printReverse(head);

    }
}
