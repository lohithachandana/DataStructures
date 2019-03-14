package Practice;
import Trees.TreeNode;
public class CheckBST {
    static  boolean checkBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left!=null){
            System.out.println(root.left.data);
            if(root.data<=root.left.data){
                return false;
            }
        }
        if(root.right!=null){
            System.out.println(root.right.data);
            if(root.data>=root.right.data){
                return false;
            }
        }

        return checkBST(root.left)&&checkBST(root.right);
    }

    public static void main(String[] args){
        TreeNode head= new TreeNode(1);
        TreeNode a= new TreeNode(2);
        TreeNode b= new TreeNode(3);
        TreeNode c= new TreeNode(4);
        TreeNode d= new TreeNode(5);
        TreeNode e= new TreeNode(6);
        TreeNode f= new TreeNode(7);
        head.left=a;head.right=b;
        a.left=c;a.right=d;
        b.left=e;b.right=f;
        System.out.println(checkBST(head));

    }
}
