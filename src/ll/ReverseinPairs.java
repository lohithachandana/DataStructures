package ll;

public class ReverseinPairs {
    public static void reverse(Node head){
        if(head!=null&&head.next!=null){
            Node next=head.next;
            int temp=head.data;
           // System.out.println("temp:"+temp);
            head.data=next.data;
            next.data=temp;
            //System.out.println("head:"head.data);
            reverse(next.next);
        }
    }

    static Node reverseNodes(Node head){
        Node tmp;
        if(head==null|| head.next==null){
            return head;
        }else{
           tmp=head.next;
           Node node=tmp.next;
           //head.next=tmp.next;
           tmp.next=head;
           //head=tmp;
          // head.next.next=reverseNodes(head.next.next);
            head.next=reverseNodes(node);
            //return head;
            return tmp;
        }


    }

    public static void main(String[] args){
        Node head = new Node(10);
        Node a = new Node(19);

        Node b = new Node(20);
        Node c = new Node(28);
        Node d = new Node(8);
        Node e = new Node(81);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next=e;
       // reverse(head);
        //exchange(head);
       // Node list=head;
        Node list=reverseNodes(head);
        while(list!=null){
               System.out.println(list.data);
                list=list.next;
        }
            System.out.println(" is the new list");
        }


    }

