package problems;

public class AddLinkedLists {
    static int carry=0;
    static ListNode add(ListNode head1,ListNode head2){

       if(head1==null){
           return null;
       }
       ListNode node= new ListNode(0);
       node.next=add(head1.next,head2.next);
       int sum=head1.data+head2.data+carry;
       if(sum>=10){
           carry=sum/10;
           sum=sum%10;
       }
       node.data=sum;
       return node;
    }

    static void print(ListNode node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        ListNode a = new ListNode(6);
        head.next = a;
        ListNode b = new ListNode(5);
        a.next = b;

        ListNode c = new ListNode(4);
        //b.next = c;
        ListNode d = new ListNode(5);
        c.next = d;
        ListNode e = new ListNode(6);
        d.next = e;
       ListNode node=add(head,c);
       if(carry>0){
           ListNode res= new ListNode(carry);
           res.next=node;
           print(res);
       }else{
           print(node);
       }



    }
}
