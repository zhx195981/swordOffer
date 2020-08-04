package binaryTree;

public class isSymmetrical {
    boolean func(TreeNode pRoot)
    {
        return help(pRoot,pRoot);
    }

    boolean help(TreeNode pRoot1,TreeNode pRoot2)
    {
        if(pRoot1 == null && pRoot2 == null)
            return true;

        if(pRoot1 == null || pRoot2 == null)
            return false;

        if(pRoot1.val != pRoot2.val)
            return false;

        return help(pRoot1.left,pRoot2.right) && help(pRoot1.right,pRoot2.left);
    }
}
