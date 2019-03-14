package ll;

import java.util.Collections;
import java.util.Stack;

public class Addition {
    private static int getSize(Node root){
        int count=0;
        while(root!=null){
            count++;
            root=root.next;
        }
        return count;
    }

    private static void result(Node root){
        Stack s=new Stack();
        while(root!=null){
            s.push(root.data);
            root=root.next;
        }
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }

    private static void printList(Node node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    private static Node newh=null,old=null,move=null;
    private static Node resize(Node root,int n) {
        for(int i=0;i<n;i++){
            Node tmp=new Node(0);
            if(newh==null){
                newh=tmp;
            }else{
                old.next=tmp;
            }
            old=tmp;
        }
        old.next=root;
        System.out.println("resized list");
        printList(newh);
        return newh;
    }


    private static Node res=null,prev=null;
    static int carry;
    private static void addlists(Node head1, Node head2){
        if(head1==null && head2==null) {
            return;
        }

        addlists(head1.next, head2.next);
        int sum = (head1.data) + (head2.data) + carry;
        if (sum >= 10) {
            carry = 1;
            sum = sum % 10;
        }else
            carry=0;
        Node temp = new Node(sum);

        if (res == null) {
            res = temp;
        } else {
            prev.next = temp;
        }
        prev = temp;
    }


    public static void main(String[] args){
        Node head = new Node(6);
        Node a = new Node(4);
        Node b = new Node(9);


        head.next = a;
        a.next = b;
      /*  b.next = c;
        c.next = d;

        Node c = new Node(5);
        Node d = new Node(7);*/

        Node head1 = new Node(4);
        Node a1 = new Node(8);

         head1.next = a1;
         int n1=getSize(head);
         int n2=getSize(head1);
         if(n1==n2){
             System.out.println("Given list : "); printList(head);
             System.out.println("Given list : ");printList(head1);
             addlists(head,head1);
         }else if(n1>n2) {
             int diff = n1 - n2;
             System.out.println("Given list");printList(head);
             addlists(head, resize(head1, diff));
         }else if(n2>n1) {
             int diff = n2 - n1;
             System.out.println("Given list");printList(head1);
             addlists(resize(head, diff), head1);
         }


        if(carry>0){
          Node carh= new Node(carry);
            prev.next=carh;
        }

        System.out.println("result list ");result(res);


    }
}
