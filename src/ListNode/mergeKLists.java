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

    /**
     * 合并两个排序的链表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeKLists1(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        else if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;

        ListNode head = new ListNode(0);
        ListNode pre = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }

        head.next = (l1 == null)? l2:l1;
        return pre.next;
    }
}
