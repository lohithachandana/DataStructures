package ll;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void remove(Node head){
        Node first, second, prev;
        first = prev = head;
        second = first.next;

        while(first != null && first.next != null) {
            while(second != null) {
                // if the data matches with the data in the first loop iterator
                // remove the second iterator element and move second to the next element
                if(first.data == second.data) {
                    prev.next = second.next;
                    second = second.next;
                } else {
                    //if it doesnt match just move the second iterator and prev
                    prev = prev.next;
                    second = second.next;
                }
            }
            first = first.next;
            second = first.next;
            prev = first;
        }


        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    static Node removeAllDups(Node A){
        Node head=A,prev=null;
        while(head!=null && head.next!=null){
            if(head.data!=head.next.data){
                prev=head;
                head=head.next;
            }else{
                Node tmp=head;

                while(tmp!=null && tmp.data==head.data){
                    tmp=tmp.next;
                }

                if(prev==null){
                    A=tmp;
                }else{
                    prev.next=tmp;
                }

                head=tmp;

                //head=head.next;
            }
        }
        return A;
    }

    public static void removeWithHashmap(Node head) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        Node prev, temp;
        temp = head.next;
        prev = head;
        map.put(head.data, true);

        while(temp != null) {
            if(map.containsKey(temp.data)) {
                //delete that node
                temp = temp.next;
                prev.next = temp.next;
            } else {
                map.put(temp.data, true);
            }
            prev = temp;
            temp = temp.next;
        }

        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }

    }

    public static void main(String[] args){
        Node head = new Node(1);
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(5);
e.next=f;
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //remove(head);
        //removeWithHashmap(head);
        Node node=removeAllDups(head); // for sorted list
while (node!=null){
    System.out.println(node.data);
    node=node.next;
}
    }
}
