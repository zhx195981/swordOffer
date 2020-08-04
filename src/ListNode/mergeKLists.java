package ListNode;

import java.util.ArrayList;

public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> ls = new ArrayList<>();
        for(ListNode node : lists){
            while(node != null){
                ls.add(node.val);
                node = node.next;

            }
        }

        ListNode head = null;
        ListNode tmp = null;
        ls.sort(((o1, o2) -> o1-o2));
        for(Integer i : ls){
            if(head == null){
                head = new ListNode(i);
                tmp = head;
            }
            else{
                tmp.next = new ListNode(i);
                tmp = tmp.next;
            }

        }

        return head;
    }
}
