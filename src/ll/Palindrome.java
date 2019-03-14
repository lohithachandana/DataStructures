package ll;

public class Palindrome {
    public static void compare(Node temp1,Node temp2, Node check){
        while(temp1!=check&&temp2!=null){
            if(temp1.data==temp2.data){
                temp1=temp1.next;
                temp2=temp2.next;
            }else{
                System.out.println("its not");
                break;
            }
        }
        if(temp1==check&&temp2==null){
            System.out.println("it is");
        }
    }


    public static Node reverse(Node ptr){
        Node temp=null;
        Node next;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=temp;
            temp=ptr;
            ptr=next;
        }
        ptr=temp;
        return ptr;
    }

    public static void main(String[] args){
        Node a=new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(3);
        Node e= new Node(2);
        Node f= new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next=f;
        int size=0;
        Node head,head1, mid, temp;
        head = mid = temp = a;

        //find the mid node
        while(temp.next != null && temp.next.next != null) {
            mid = mid.next;
            temp = temp.next.next;
        }
        //second half is reversed
        head1=reverse(mid.next);
        //for even node
        if(temp.next.next==null){
            Node pt=mid.next;
            compare(head,head1,pt);
        }
        //for odd node
        else{
            compare(head,head1,mid);
        }
    }
}
