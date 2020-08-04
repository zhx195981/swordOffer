package binaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
public class Prints {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        LinkedList<TreeNode> s1 = new LinkedList();
        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
        if(pRoot == null)
            return list;
        ArrayList<Integer> list1 = new ArrayList<>();
        s1.add(pRoot);
        int nextLevel = 0;
        int toBePrinted = 1;
        while(s1.size() != 0){
            TreeNode node = s1.pollFirst();
            list1.add(node.val);
            toBePrinted--;
            if(node.left != null) {
                s1.add(node.left);
                nextLevel++;
            }

            if(node.right != null) {
                s1.add(node.right);
                nextLevel++;
            }


            if(toBePrinted == 0){
                list.add(list1);
                toBePrinted = nextLevel;
                nextLevel = 0;
                list1 = new ArrayList<>();
            }

        }
        return list;
    }
}
