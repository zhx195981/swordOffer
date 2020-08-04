package binaryTree;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一颗二叉树的根节点和一个整数，
 * 按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> func(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        helper(root,target,cur,res);
        Collections.sort(res, (o1,o2)->o2.size()-o1.size());
        return res;

    }
    public void helper(TreeNode root, int target,ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> res){
        if(root == null)
            return;
        int value=root.val;
        cur.add(value);
        if(target == value && root.left == null && root.right == null){
            res.add(new ArrayList<>(cur));
        }
        else{
            ArrayList<Integer> cur1 = new ArrayList<>();
            cur1.addAll(cur);
            helper(root.left,target-value,cur,res);
            helper(root.right,target-value,cur1,res);
        }
    }
}
