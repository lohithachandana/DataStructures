package ll;

public class FindNthnode {
    public static void findNode(int n,int s,Node head){
        Node nod=head;
        int node= s-n+1;
        for(int i=1;i<node;i++) {
            nod=nod.next;

        }
        System.out.print(nod.data);
    }
    public static void main(String[] args){

        Node head = new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);

        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=d;
        d.next=e;
        Node check= head;
        int size=0;
        while(check!=null){
           // System.out.println(check.data);
            check=check.next;
            size=size+1;
        }
        //System.out.println(size);
        findNode(3,size,head);
    }
}


