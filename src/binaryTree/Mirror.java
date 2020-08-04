package binaryTree;

public class Mirror {
    public void Mirror1(TreeNode root) {

        if(root == null){
            return ;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror1(root.left);
        Mirror1(root.right);
    }
}
