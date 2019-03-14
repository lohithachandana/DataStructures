package MediumQuestions;
import ll.Node;

import static ll.Palindrome.reverse;

public class MultiplicationLinkedLists {

    static Node formList(int res,Node node){
        if(res==0){
            return node;
        }
        int last=res%10;res=res/10;
        node=new Node(last);
        Node node1=null;
        node.next=formList(res,node1);
        return node;
    }

    static Node multiplyLists(Node a,Node b){
        int num1=0,num2=0;
        Node node=null;
        while(a!=null){
            num1=num1*10+a.data;a=a.next;

        }
        while (b!=null){
            num2=num2*10+b.data;
            b=b.next;
        }

        int res= num1*num2;

        Node check= formList(res,node);
        Node out= reverse(check);
        return out;

    }

    public static void main(String[] args){
        Node head1= new Node(9);
        Node a= new Node(4);head1.next=a;
        Node b= new Node(6);a.next=b;

        Node head2= new Node(8);
        Node a1= new Node(4);head2.next=a1;

        Node node=multiplyLists(head1,head2);
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }

    }
}
