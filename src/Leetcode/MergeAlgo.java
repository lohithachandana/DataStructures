
package Leetcode;
import problems.ListNode;
class LiNode {
    int val;
    LiNode next;
    LiNode(int x) { val = x;
        next=null;}
}
class Solution {

    public static LiNode merge(LiNode l1,LiNode l2){
        System.out.println("merge method");
        LiNode head=new LiNode(0);
        LiNode tmp=head;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                tmp.next=l1;
                l1=l1.next;
            }else {
                tmp.next = l2;
                l2=l2.next;
            }
            tmp=tmp.next;
        }
        if(l1!=null){
            tmp.next=l1;
            l1=l1.next;
        }
        if(l2!=null){
            tmp.next=l2;
            l2=l2.next;
        }
        return  head.next;
    }




    public static LiNode mergeTwoLists(LiNode head,LiNode head1){
        LiNode newN= new LiNode(0);

        if(head==null){

            return head1;
        }
        if(head1==null){

            return head;
        }
        if(head.val<head1.val){
            newN=head;
            newN.next= mergeTwoLists(head.next,head1);
        }else{
            newN=head1;
            newN.next= mergeTwoLists(head,head1.next);
        }

        return newN;

    }
    public static void main(String[] args){
        LiNode head = new LiNode(1);
        LiNode a = new LiNode(2);
        LiNode b = new LiNode(4);
        //   ListNode c = new ListNode(28);
        //ListNode d = new ListNode(35);

        head.next = a;
        a.next = b;
        // b.next = c;
        //c.next = d;

        LiNode head1 = new LiNode(1);
        LiNode a1 = new LiNode(3);
        LiNode b1 = new LiNode(4);
        // ListNode c1 = new ListNode(23);
        //ListNode d1 = new ListNode(31);

        head1.next = a1;
        a1.next = b1;
        //b1.next = c1;
        // c1.next = d1;
       // ListNode merge=mergeTwoLists(head,head1);
        LiNode merge=merge(head,head1);
        while(merge!=null){
            System.out.println(merge.val);
            merge=merge.next;

        }
    }

}

