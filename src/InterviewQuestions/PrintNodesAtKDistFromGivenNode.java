package InterviewQuestions;
import InterviewQuestions.TreeNode;
public class PrintNodesAtKDistFromGivenNode {
    static void printNodedown(TreeNode node,int k){
        if(node!=null){
            System.out.println("node entered is "+node.data+" with k value as "+k);
        }

        if(node==null||k<0){
            return;
        }
        if(k==0){
            System.out.println(node.data);
            return;
        }
        printNodedown(node.left,k-1);
        printNodedown(node.right,k-1);

    }

    static int printNodes(TreeNode root,TreeNode node,int k){
        if(root==null){
            return -1;
        }
        if(root==node){
            printNodedown(root,k);
            return 1;
        }
        if(k==0){
            return k;
        }
        int dl=printNodes(root.left,node,k);
        System.out.println("dl: "+dl+" for node "+root.data);

        if(dl!=-1){
            if(dl==k){
                System.out.println(root.data);
                System.out.println("");
            }else{
                printNodedown(root.right,k-dl-1);
            }
            return dl+1;
        }
        int dr=printNodes(root.right,node,k);
        System.out.println("dr: "+dr+" for node "+root.data);

        if(dr!=-1){
            if(dr==k){
                System.out.println(root.data);
                System.out.println("");
            }else{
                printNodedown(root.left,k-dr-1);
            }
            return dr+1;
        }
        return -1;
    }

    public static void main(String[] args){
        TreeNode head= new TreeNode(2);
        TreeNode a= new TreeNode(3);
        TreeNode b= new TreeNode(4);
        TreeNode c= new TreeNode(5);
        TreeNode d= new TreeNode(6);
        TreeNode e= new TreeNode(7);
        TreeNode f= new TreeNode(8);
        head.left=a;head.right=b;
        a.left=c;a.right=d;
        d.left=e;d.right=f;
        int k=2;
        printNodes(head,c,k);


    }
}
