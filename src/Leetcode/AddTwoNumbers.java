//package Leetcode;
//
//import problems.ListNode;
//
//public class AddTwoNumbers {
//        static int getSize(ListNode node){
//            int count=0;
//            while(node!=null){
//                count++;
//                node=node.next;
//            }
//            return count;//
//        }
//        static ListNode resize(ListNode node,int diff){
//            ListNode head=node;
//            while(node.next!=null){
//                node=node.next;
//            }
//            ListNode prev=node;
//            for(int i=0;i<diff;i++){
//                ListNode temp=new ListNode(0);
//                prev.next=temp;
//                prev=temp;
//            }
//            return head;
//
//        }
//
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            if(getSize(l1)<getSize(l2)){
//                int diff= getSize(l2)-getSize(l1);
//                l1=resize(l1,diff);
//            }else{
//                int diff= getSize(l1)-getSize(l2);
//                l2=resize(l2,diff);
//            }
//            int sum=0,carry=0;
//            ListNode head=null,prev=null;
//            while(l1!=null && l2!=null){
//                sum=carry+l1.data+l2.data;
//                if(sum>=10){
//                    carry=1;
//                }
//                sum=sum%10;
//                ListNode temp=new ListNode(sum);
//                if(head==null){
//                    head=temp;
//                }else{
//                    prev.next=temp;
//                }
//                prev=temp;
//                temp=temp.next;
//
//                l1=l1.next;l2=l2.next;
//            }
//            return head;
//        }
//        public static void main(String[] args){
//            ListNode head1=new ListNode(2);
//            ListNode a=new ListNode(4);
//            ListNode b=new ListNode(3);
//            head1.next=a;a.next=b;
//            ListNode head2=new ListNode(5);
//            ListNode a1=new ListNode(6);
//            ListNode b1=new ListNode(4);
//            head2.next=a1;a1.next=b1;
//            Leetcode.Solution ob=new Leetcode.Solution();
//            ListNode head= ob.addTwoNumbers(head1,head2);
//            while(head!=null){
//                System.out.println(head.data);
//                head=head.next;
//            }
//        }
//    }
//
