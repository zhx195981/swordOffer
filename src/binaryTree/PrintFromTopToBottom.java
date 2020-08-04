package binaryTree;


import java.util.ArrayList;
import java.util.LinkedList;

/**
      * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
      */

        public class PrintFromTopToBottom {

            public static ArrayList<Integer> Funcs (TreeNode root){
                ArrayList<Integer> list = new ArrayList<>();
                LinkedList<TreeNode> ls = new LinkedList<>();

                if (root == null)
                    return list;

                ls.add(root);
                while(ls.size() != 0){
                    TreeNode temp = ls.pollFirst();
                    list.add(temp.val);
                    if(temp.left != null) ls.add(temp.left);
                    if(temp.right != null) ls.add(temp.right);
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
             ArrayList<Integer> a =  Funcs(treeNode);
             for( int i: a)
                System.out.println(i);




         }

        }
