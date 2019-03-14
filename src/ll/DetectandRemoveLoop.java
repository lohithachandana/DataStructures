package ll;

public class DetectandRemoveLoop {
    static int detectLoop(Node head) {
        if (head == null) {
            return 0;
        }
        Node sp = head, fp = head;

        while (sp!=null && fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if (sp == fp) {
                //System.out.println(head.data);
                removeLoop(sp, head);
                return 1;
            }
        }
return 0;
    }
    static void removeLoop(Node loop,Node node){

        Node pt1=null,pt2=null;
        pt1=node;
        while(true){
            pt2=loop;
            while(pt2.next!=loop && pt2.next!=pt1){
                pt2 = pt2.next;
            }
            if(pt2.next==pt1){

                break;
            }
            pt1=pt1.next;
        }
        pt2.next=null;

       // return head;

    }


    public static void main(String[] args){
        Node head=new Node(1);
        Node a=new Node(2);head.next=a;
        Node b=new Node(3);a.next=b;
        Node c=new Node(4);b.next=c;
        Node d=new Node(5);c.next=d;
        Node e=new Node(6);d.next=e;
        Node f=new Node(7);e.next=f;
        Node g=new Node(8);f.next=g;
        g.next=b;
        detectLoop(head);
//        System.out.println(node.data+" check");
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }
}
