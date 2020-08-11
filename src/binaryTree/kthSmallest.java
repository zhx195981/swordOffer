package binaryTree;

public class kthSmallest {

    int ans;
    int n;
    public int kthSmallest1(TreeNode root, int k) {
        if(root == null)
            return 0;
        inOrder(root, k);
        return ans;

    }

    public void inOrder(TreeNode root,int k){

        if(root.left != null) inOrder(root.left, k);

        n++;
        if(n == k) {
            ans = root.val;
            return;
        }

        if(root.right != null) inOrder(root.right, k);
    }
}
