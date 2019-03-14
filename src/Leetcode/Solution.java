/*
package Leetcode;

*/
/*
import java.util.Scanner;

class BinarySearchFirstnLastOccurence {
   *//*

*/
/* public int smallestDistancePair(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int x=-1,y=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff=Math.abs(nums[i]-nums[j]);

            }
        }
    }*//*
*/
/*

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        int size=s.nextInt();
        if(size>=2 && size<=10000){
            int[] input=new int[size];
            for(int i=0;i<size;i++){
                System.out.println("Enter inter no. "+i);
                int v=s.nextInt();
                if(v>=0 && v<1000000){
                    input[i]=v;
                }
            }
            System.out.println("Enter k value");
            int k=s.nextInt();
            if(k>=1 && k<= size*(size-1)/2){
                BinarySearchFirstnLastOccurence sol=new BinarySearchFirstnLastOccurence();
               // sol.smallestDistancePair(input,k);
            }
        }
    }
}*//*

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x;next=null; }
}

class Solution {
    static int getSize(ListNode node){
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        return count;
    }
    static ListNode resize(ListNode node,int diff){
        ListNode head=node;
        while(node.next!=null){
            node=node.next;
        }
        ListNode prev=node;
        for(int i=0;i<diff;i++){
            ListNode temp=new ListNode(0);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(getSize(l1)<getSize(l2)){
            int diff= getSize(l2)-getSize(l1);
            l1=resize(l1,diff);
        }else{
            int diff= getSize(l1)-getSize(l2);
            l2=resize(l2,diff);
        }
        int sum=0,carry=0;
        ListNode head=null,prev=null;
        while(l1!=null && l2!=null){
            sum=carry+l1.val+l2.val;
            if(sum>=10){
                carry=1;
            }
            sum=sum%10;
            ListNode temp=new ListNode(sum);
            if(head==null){
                head=temp;
            }else{
                prev.next=temp;
            }
            prev=temp;
            temp=temp.next;

            l1=l1.next;l2=l2.next;
        }
        return head;
    }
    public static void main(String[] args){
        ListNode head1=new ListNode(2);
        ListNode a=new ListNode(4);
        ListNode b=new ListNode(3);
        head1.next=a;a.next=b;
        ListNode head2=new ListNode(5);
        ListNode a1=new ListNode(6);
        ListNode b1=new ListNode(4);
        head2.next=a1;a1.next=b1;
        Solution ob=new Solution();
        ListNode head= ob.addTwoNumbers(head1,head2);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
}*/
