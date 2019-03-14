package ll;

public class Sort {
public static void circleSort(Node check,int size ){

}

    public static void sortMe(Node nod,int n){
        for(int i=1;i<=n;i++){

            Node node=nod;
            while(node.next!=null) {
                if(node.data>node.next.data) {
                    node=node.next;
                } else{
                    int temp= node.data;
                    node.data=node.next.data;
                    node.next.data= temp;
                }
            }
        }

        Node nN=nod;
        while(nN!=null) {
            System.out.println(nN.data);
            nN=nN.next;
        }
      //  System.out.println(nN.data);
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
        //e.next=head;// circular linked list
        Node check= head;
        int size=0;
        while(check!=null){
            System.out.println(check.data);
            check=check.next;
            size=size+1;
        }
        //size=size+1;
        System.out.println(" size is "+ size);
        sortMe(head, size);
    }
}

