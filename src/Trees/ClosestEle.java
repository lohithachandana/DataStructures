package Trees;

public class ClosestEle {

    public int goal;
    public int min = Integer.MAX_VALUE;

    public  int findClosest(TreeNode root, int k) {

            helper(root, k);
            return goal;

    }

        public void helper(TreeNode root, int target){
            if(root==null)
                return;

            if(target < root.data){
                helper(root.left, target);
            }else{
                helper(root.right, target);
            }
            if(Math.abs(root.data - target) < min){
                min = Math.abs(root.data-target);
                goal = root.data;
            }

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
        ClosestEle find=new ClosestEle();
        int closest=find.findClosest(root,25);
        System.out.println("closest element is "+closest);
    }
}
