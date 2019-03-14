package MediumQuestions;
import ll.Node;
//withoutModifyinglists
public class AddLinkedLists {
       static int getlength(Node head){
           int count=0;
           while(head!=null){
               count++;
               head=head.next;
           }
           return count;
       }

       static Node addZeroes(Node a,int diff){
           while(diff!=0){
               Node node=new Node(0);
               node.next=a;
               a=node;
               diff--;
           }
           return a;
       }
       static int carry=0;
       static Node addLists(Node a,Node b){
           Node node=new Node(0);
           if(a==null){
               return null;
           }
           node.next=addLists(a.next,b.next);
           int sum=a.data+b.data+carry;
           carry=sum/10;
           sum=sum%10;
           node.data=sum;
           return node;
       }

    public static void main(String[] args){
        Node head1= new Node(9);
        Node a= new Node(4);head1.next=a;
        Node b= new Node(6);a.next=b;

        Node head2= new Node(8);
        Node a1= new Node(4);head2.next=a1;
       // Node b1= new Node(6);a1.next=b1;

        int l1=getlength(head1);
        int l2=getlength(head2);

        Node res=null;

        if(l1!=l2){
            int diff=Math.abs(l1-l2);
            if(l1<l2){
               head1= addZeroes(head1,diff);
            }else{
                head2=addZeroes(head2,diff);
            }
        }
        res= addLists(head1,head2);
        //int[] count = new int[ASCII_S];
        Node head=null;
        if(carry>0){
            head=new Node(carry);
            head.next=res;
        }else{
            head=res;
        }
        while(head!=null){
            System.out.print(head.data);
            head=head.next;
        }
    }
}
