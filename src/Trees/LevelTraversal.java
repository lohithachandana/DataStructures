package Trees;

import java.util.ArrayList;

public class LevelTraversal {
    public ArrayList<Integer> res=new ArrayList<Integer>();

    public  void queueless(TreeNode root){
        TreeNode node=root;
        res.add(root.data);
        print(root);
        System.out.println(res+" is the level order traversal");
    }
    public void print(TreeNode root) {
        if(root==null)
            return;
        if (root.left != null)
            res.add(root.left.data);
        if (root.right != null)
            res.add(root.right.data);

       print(root.left);
       print(root.right);
    }
    public static void main(String[] args){
        TreeNode root= new TreeNode(1);
        TreeNode a= new TreeNode(2);
        TreeNode b= new TreeNode(3);
        TreeNode c= new TreeNode(4);
        TreeNode d= new TreeNode(5);
        TreeNode e= new TreeNode(6);
        TreeNode f= new TreeNode(7);
        TreeNode g= new TreeNode(8);
        TreeNode h= new TreeNode(9);
        TreeNode i= new TreeNode(10);

        root.left=a;root.right=b;
        a.left=c;a.right=d;b.left=e;b.right=f;
        d.left=g;e.right=h;f.right=i;
        LevelTraversal obj= new LevelTraversal();
        obj.queueless(root);
    }
}
