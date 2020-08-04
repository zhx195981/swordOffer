package binaryTree;

import java.util.ArrayList;

/**
 * 搜索二叉树转成双向排序链表
 * author:zhx
 */
public class Convert {

    /**
     *方法1：直接将二叉树进行中序遍历存入list，间接从list中建立双向链表
     * @param root
     * @return
     * 方法牛客用时：11ms
     */
    public TreeNode Convert1(TreeNode root){
        if(root == null)
            return null;

        ArrayList<TreeNode> list = new ArrayList<>();
        inOrder(root,list);

        for(int i = 0; i < list.size()-1; i++){
            list.get(i).right = list.get(i+1);
            list.get(i+1).left = list.get(i);
        }

        return list.get(0);
    }
    private static void inOrder(TreeNode root,ArrayList<TreeNode> list){
        if(root.left != null)
            inOrder(root.left, list);
        list.add(root);
        if(root.right != null)
            inOrder(root.right, list);
    }

    /**
     *方法2：直接中序遍历输出  降序  因此需要提前定义好头部
     * @param root
     * @return
     * 方法牛客用时：12ms
     */
    TreeNode pre = null;
    TreeNode head = null;
    public TreeNode Convert2(TreeNode root){
        if(root == null)
            return null;

        Convert2(root.left);

        if(head == null)
            head = root;

        if(pre != null){
            pre.right = root;
            root.left = pre;
        }
        pre = root;
        Convert2(root.right);
        return head;

    }
    /**
     *方法3：直接中序遍历（先右再左） 输出  升序
     * @param root
     * @return
     * 方法牛客用时：14ms
     */
    public TreeNode Convert3(TreeNode root){
        if(root == null)
            return null;

        Convert3(root.right);

        if(pre != null){
            pre.left = root;
            root.right = pre;
        }
        pre = root;
        Convert3(root.left);
        return pre;

    }

}
