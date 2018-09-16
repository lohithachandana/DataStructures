package problems;
import problems.ListNode;
public class MultiplyLinkedlists {

    static ListNode reverseList(ListNode node){
       // ListNode head=node;
        ListNode prev=null;
        while(node!=null){
            ListNode next=node.next;
            node.next=prev;
          //  next.next=node;
            prev=node;
            node=next;
            //len++;
        }
        return prev;
    }
    static int length(ListNode node){
        int len=0;
        while(node!=null){
            len++;
            node=node.next;
        }
        return len;
    }

    static ListNode initialiseList(int len){
        ListNode head= new ListNode(0);
        ListNode prev=head;len--;
        while(len!=0){
            ListNode node=new ListNode(0);len--;
            prev.next=node;
            prev=node;
        }
        prev.next=null;
        return head;
    }

    static ListNode multiplyLists(ListNode first,ListNode second){
         first=reverseList(first);
         second=reverseList(second);

         int m=length(first);
         int n=length(second);

        ListNode res=initialiseList(m+n+1);
        ListNode res1=res;
        ListNode res_ptr=res,sec_ptr=second;

        while(sec_ptr!=null){
            int carry=0;ListNode first_ptr=first;res_ptr=res;
                while(first_ptr!=null){
                    res_ptr.data+=(sec_ptr.data*first_ptr.data)+carry;
                    if(res_ptr.data>=10){
                        carry=res_ptr.data/10;
                        res_ptr.data=res.data%10;
                    }
                    first_ptr=first_ptr.next;res_ptr=res_ptr.next;
                }
                sec_ptr=sec_ptr.next;
                res=res.next;

        }

        return res1;

    }


    public static void main(String[] arhs){

        ListNode head1=new ListNode(1);
        ListNode a=new ListNode(2);head1.next=a;

        ListNode head2=new ListNode(1);
        ListNode a1=new ListNode(2);head2.next=a1;
        ListNode res= multiplyLists(head1,head2);
        res=reverseList(res);
        while(res!=null){
            System.out.print(res.data);
            res=res.next;
        }
    }

}
