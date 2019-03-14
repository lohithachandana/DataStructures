package MediumQuestions;

import ll.Node;

import static MediumQuestions.AddLinkedLists.addZeroes;

public class SubtractLinkedLists {

    static boolean borrow;

    static int getlength(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    static Node subtract(Node a,Node b){

        if(a==null && b==null){
            return null;
        }

        Node next=subtract(a.next,b.next);
        int d1=a.data,d2=b.data;

        if(borrow){
            d1=d1-1;
            borrow=false;
        }

        if(d1<d2){
            d1=d1+10;
            borrow=true;
        }

        Node sub=new Node(d1-d2);
        sub.next=next;
        return sub;
    }

    public static void main(String[] args){

        Node head1= new Node(9);
       // Node a= new Node(5);head1.next=a;
        //Node b= new Node(0);a.next=b;

        Node head2= new Node(2);
        Node a1= new Node(5);head2.next=a1;

        int l1=getlength(head1);
        int l2=getlength(head2);


        if(l1!=l2){
            int diff=Math.abs(l1-l2);
            if(l1<l2){
                head1= addZeroes(head1,diff);
            }else{
                head2=addZeroes(head2,diff);
            }
        }

        borrow=false;
        Node res=head1.data>head2.data?subtract(head1,head2):subtract(head2,head1);
        while(res!=null){
            System.out.print(res.data);
            res= res.next;
        }
    }
}
