package binaryTree;

public class HasSubtree {
    public static boolean testFunc(TreeNode root1,TreeNode root2){
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val == root2.val){
            if(judge(root1,root2))
                return true;
        }

        return testFunc(root1.left,root2) || testFunc(root1.right,root2);
    }

    public static boolean judge(TreeNode root1,TreeNode root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;

        if(root1.val == root2.val)
            return judge(root1.left,root2.left) && judge(root1.right,root2.right);

        return false;
    }
}
