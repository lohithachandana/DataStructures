package Trees;
import java.util.ArrayList;
public class FloornCeil {
    private static ArrayList<Integer> res= new ArrayList<Integer>();

    public static void inorder(TreeNode root){

        if(root==null)
            return;
        inorder(root.left);
        res.add(root.data);
        inorder(root.right);

    }
    public static int floor(TreeNode root, int key){
            inorder(root);
            for(int i=0;i<res.size();i++){
                if(res.get(i)==key){
                    return res.get(i);
                }else if(res.get(i)>key){
                    return res.get(i-1);
                }
            }
            return 0;
    }
    public static int ceil(TreeNode root,int key){
        inorder(root);
        for(int i=0;i<res.size();i++){
            if(res.get(i)==key){
                return res.get(i);
            }else if(res.get(i)>key){
                return res.get(i);
            }
        }
        return 0;
    }

    public static int findh(TreeNode root){
        int lefth=-1,righth=-1;
        if(root==null)
            return -1;
        if(root.left!=null)
            lefth=findh(root.left);
        if(root.right!=null)
            righth=findh(root.right);
        return Math.max(lefth,righth)+1;


    }


    public static void main(String[] args){

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
        //System.out.println("floor of the given key is "+floor(root,21));
        //System.out.println("ceil of the given key is "+ceil(root,8));
        System.out.println("height is "+findh(root));
    }
}
