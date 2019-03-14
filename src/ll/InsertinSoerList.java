package ll;

public class InsertinSoerList {
    public static void insert(int d,Node nod){
        Node nod1=nod;
        Node curr=new Node(d);
       // System.out.println("data is "+ nod.data);
        while(nod1!=null){
            if(nod1.data<curr.data&&nod1.next==null){
                nod1.next=curr;
            }
            if(nod1.data<curr.data && curr.data<nod1.next.data){
                curr.next=nod1.next;
                nod1.next=curr;
                break;
            } else{
            nod1=nod1.next;
            }
        }

        Node j=nod;
       // System.out.println("data is "+ nod.data);
        while(j!=null){
            System.out.println(j.data);
            j=j.next;
        }


}
    public static void main(String[] args) {

        Node head = new Node(10);
        Node a = new Node(13);
        Node b = new Node(20);
        Node c = new Node(28);
        Node d = new Node(35);

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
       /* Node i=head;
        while(i!=null){
            System.out.println("list is"+ i.data);
            i=i.next;
        }*/
        insert(37, head);
    }
}
