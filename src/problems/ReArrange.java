package problems;

public class ReArrange {

    static ListNode reverse(ListNode head){
        ListNode prev=null,node=head;
        while(node!=null){
            ListNode next= node.next;
            node.next=prev;
            prev=node;
            node=next;
        }
        return prev;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(4);
        head.next = a;
        ListNode b = new ListNode(3);
        a.next = b;
        ListNode c = new ListNode(2);
        b.next = c;
        ListNode d = new ListNode(5);
        c.next = d;
        ListNode e = new ListNode(7);
        d.next = e;

        //reArrange(head);
    }
}
