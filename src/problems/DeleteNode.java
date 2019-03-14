package problems;

public class DeleteNode {


    static ListNode deleteNode(ListNode head,ListNode node){

        ListNode res=head;
        while(head!=null){


        if(head==node){
            head=head.next;
            return head;
        }
        if(head.next.data==node.data){
            System.out.println("entered");
            ListNode tmp= node.next;
            head.next=node.next;

            return res;
           // node.next=null;

        }
        head=head.next;
        }
        return res;
    }
    static ListNode remove(ListNode head,int x){
        ListNode res=head;
        while (head!=null){

            if(head.data==x){
                head=head.next;
                res=head;
            }else if(head.next.data==x){
                ListNode tmp=head.next;
                head.next=head.next.next;
                //tmp.next=null;
                head=head.next;
            }else{
                head=head.next;
            }

        }
        return  res;
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
        ListNode e = new ListNode(2);
        d.next = e;
        //remove(head,2);
        head=remove(head,2);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
