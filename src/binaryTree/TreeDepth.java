package binaryTree;

public class TreeDepth {
    public static int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = new TreeNode(4);
        treeNode1.right = new TreeNode(5);
        int a = TreeDepth(treeNode);
        System.out.println(a);
    }
}
