package Trees;

import java.util.ArrayList;

public class FindkthsmallestEle {
    private static ArrayList<Integer> res= new ArrayList<Integer>();

    public static void findkth(TreeNode root, int k){

        if(root==null)
            return;
        findkth(root.left,k);
        res.add(root.data);
        findkth(root.right,k);

    }

    public static  void main(String[] args){
        TreeNode root= new TreeNode(9);
        TreeNode a= new TreeNode(4);
        TreeNode b= new TreeNode(17);
        TreeNode c= new TreeNode(3);
        TreeNode d= new TreeNode(6);
        TreeNode e= new TreeNode(7);
        TreeNode f= new TreeNode(22);
        TreeNode g= new TreeNode(5);
        TreeNode h= new TreeNode(20);


        root.left=a;root.right=b;
        a.left=c;a.right=d;;b.right=f;
        d.left=g;d.right=e;f.left=h;
        int k=3;
        findkth(root,k);
        System.out.println(res.get(k-1));

    }
}
