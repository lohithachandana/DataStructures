package Trees;

public class HegihtOfTree {
    static int findH(TreeNode root){
        if(root==null){
            return -1;
        }
        return Math.max(findH(root.left),findH(root.right))+1;
    }

    public static void main(String[] args){
        TreeNode root= new TreeNode(1);
        TreeNode a= new TreeNode(2);root.left=a;
        TreeNode b= new TreeNode(3);root.right=b;
        TreeNode c= new TreeNode(4);a.left=c;
        TreeNode d= new TreeNode(5);a.right=d;
        TreeNode e= new TreeNode(6);d.right=e;
        System.out.println(findH(root));

    }
}
