package ll;
//1->2->3->4->5->6->7->8
//output:1->8->2->7->3->6->4->5
public class printAlternativefirstnlast {


    static void print(Node head){
        Node node=head;int count=1;
        while(node.next!=null){
            node=node.next;
            count++;
        }
        //System.out.println(count);
        Node last=node;
        int mid=1;
        while(mid<=count/2){
            System.out.println(head.data);head=head.next;
            System.out.println(last.data);last=last.prev;
            mid++;
        }
    }
    public static void main(String[] args){
        Node head= new Node(1);
        Node a = new Node(2);head.next=a;a.prev=head;
        Node b = new Node(3);a.next=b;b.prev=a;
        Node c = new Node(4);b.next=c;c.prev=b;
        Node d = new Node(5);c.next=d;d.prev=c;
        Node e = new Node(6);d.next=e;e.prev=d;
        Node f = new Node(7);e.next=f;f.prev=e;
        Node g = new Node(8);f.next=g;g.prev=f;
        print(head);
    }
}
