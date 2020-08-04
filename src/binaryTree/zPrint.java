package binaryTree;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
        public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            if (pRoot == null)
                return list;
            int layer = 1;
            //奇数层
            Stack<TreeNode> s1 = new Stack<>();
            s1.push(pRoot);
            Stack<TreeNode> s2 = new Stack<>();
            while (!s1.empty() || !s2.empty()) {
                if (layer % 2 != 0) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    while (!s1.empty()) {
                        TreeNode node = s1.pop();
                        temp.add(node.val);
                        System.out.print(node.val + " ");
                        if (node.left != null) s2.push(node.left);
                        if (node.right != null) s2.push(node.right);
                    }
                    if (!temp.isEmpty()) {
                        list.add(temp);
                        layer++;
                        System.out.println();
                    }

                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    while (!s2.empty()) {
                        TreeNode node = s2.pop();
                        temp.add(node.val);
                        System.out.print(node.val + " ");
                        if (node.right != null) s1.push(node.right);
                        if (node.left != null) s1.push(node.left);
                    }
                    if (!temp.isEmpty()) {
                        list.add(temp);
                        layer++;
                        System.out.println();
                    }
                }
            }
            return list;
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
        Print(treeNode);
    }
}
