package binaryTree;

public class IsBalanced_Solution {
    public boolean func(TreeNode root) {
        if(root == null)
            return true;

        return Depth(root) != -1;

    }

    public int Depth(TreeNode root){

        if(root == null)
            return 0;
        int left = Depth(root.left);
        int right = Depth(root.right);
        if(left == -1 || right == -1 || Math.abs(left-right) > 1)
            return -1;
        else
            return Math.max(left,right) + 1;
    }

}
