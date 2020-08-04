package binaryTree;
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class GetNext {
    public TreeLinkNode funcs(TreeLinkNode pNode)
    {
        if(pNode == null)
            return null;

        TreeLinkNode father = pNode.next;
        TreeLinkNode temp;
        TreeLinkNode tmp;

        if(pNode.right != null){
            temp = pNode.right;
            while(temp.left != null){
                temp = temp.left;
            }
            return temp;
        } else if(father != null){

            if(father.left == pNode) return father;

            if(father.right == pNode){
                while(father.next != null){
                    tmp = father;
                    father = father.next;
                    if(father.left == tmp)
                        return father;
                }

            }
        }

        return null;
    }
}
