package binaryTree;

public class outPrint {
    /**
     * 递归实现前序遍历
     * @param root
     */
    public static void preOrder(TreeNode root){
        System.out.print(root.val + "\t");
        if(root.left != null) preOrder(root.left);
        if(root.right != null) preOrder(root.right);

    }
    /**
     * 递归实现中序遍历
     * @param root
     */
    public static void inOrder(TreeNode root){
        if(root.left != null) inOrder(root.left);
        System.out.print(root.val + "\t");
        if(root.right != null) inOrder(root.right);

    }
    /**
     * 递归实现后序遍历
     * @param root
     */
    public static void postOrder(TreeNode root){
        if(root.left != null) inOrder(root.left);
        if(root.right != null) inOrder(root.right);
        System.out.print(root.val + "\t");

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = new TreeNode(4);
        treeNode1.right = new TreeNode(5);
        treeNode2.left = new TreeNode(6);
        treeNode2.right = new TreeNode(7);
        System.out.println("前序遍历序列为：");
        preOrder(treeNode);
        System.out.println();
        System.out.println("中序遍历序列为：");
        inOrder(treeNode);
        System.out.println();
        System.out.println("后序遍历序列为：");
        postOrder(treeNode);


    }
}
