package ll;

public class ReverseKNodes {
    public  Node reverseKnodes(Node head,int k) {
        Node node=head;
        Node temp=head;
        int ln = 0,count=0;
        Node prev = null;
        Node next = null;
        for(int i=0;i<k;i++){
            if(temp!=null){
                count++;
                temp=temp.next;
            }
        }

        if(count==k){
            while (node != null && ln < k) {
                next = node.next;
                node.next = prev;
                prev = node;
                node = next;
                ln = ln + 1;
            }
            if(node!=null){
                head.next=reverseKnodes(node, k);
            }
        }else{
           prev=head;
        }


    return prev;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
       /* Node a1 = new Node(9);
        Node b1 = new Node(21);
        Node c1 = new Node(23);
        Node d1 = new Node(31);
*/
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
       /* d.next = a1;
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;*/
        ReverseKNodes obj=new ReverseKNodes();
        Node ptr=obj.reverseKnodes(head,3);
        while(ptr!=null){
                System.out.println(ptr.data);
                ptr=ptr.next;
            }
        }

    }

