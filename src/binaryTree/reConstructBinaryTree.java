package binaryTree;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */

public class reConstructBinaryTree {

    public static TreeNode func(int [] pre,int [] in){
        TreeNode root= help(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }

    public static TreeNode help(int [] pre, int preStart,int preEnd,int [] in, int inStart,int inEnd){
        if(preStart > preEnd || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStart]);
        for(int i = inStart; i <= inEnd; i++){
            if(in[i] == root.val){
                root.left = help(pre,preStart+1,preStart-inStart+i ,in,inStart,i-1);
                root.right = help(pre,preStart-inStart+i+1 ,preEnd ,in,i+1,inEnd);
                break;
            }

        }
        return root;
    }

    public static void main(String[] args) {
        int [] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};
        TreeNode a =  func(pre,in);
        outPrint.preOrder(a);
        outPrint.inOrder(a);

    }
}
