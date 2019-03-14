package problems;

public class PartitonList {
    public static ListNode partition(ListNode head, int x) {
        if(head == null) return null;

        ListNode fakeHead1 = new ListNode(0);
        ListNode fakeHead2 = new ListNode(0);
        fakeHead1.next = head;

        ListNode p = head;
        ListNode prev = fakeHead1;
        ListNode p2 = fakeHead2;

        while(p != null){
            if(p.data < x){
                p = p.next;
                prev = prev.next;
            }else{

                p2.next = p;
                prev.next = p.next;

                p = prev.next;
                p2 = p2.next;
                System.out.println("check");
                System.out.println(p2.data);
                //System.out.println(p2.next.data);
            }
        }

        // close the list
        p2.next = null;

        prev.next = fakeHead2.next;

        return fakeHead1.next;
    }

    public static void main(String[] args){
        ListNode head1=new ListNode(1);
        ListNode a=new ListNode(4);head1.next=a;
        ListNode b=new ListNode(3);a.next=b;
        ListNode c=new ListNode(2);b.next=c;
        ListNode d=new ListNode(5);c.next=d;
        ListNode e=new ListNode(2);d.next=e;
        ListNode node=partition(head1,3);
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }

    }
}
