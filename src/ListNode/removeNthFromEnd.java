package ListNode;

import java.util.ArrayList;

public class removeNthFromEnd {
    /**
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        ListNode result = null;
        ListNode temp = null;
        for(int i = 0; i < list.size(); i++){
            if( i != list.size() - n){
                if(result == null){
                    result = new ListNode(list.get(i));
                    temp = result;
                    continue;
                }

                temp.next = new ListNode(list.get(i));
                temp = temp.next;
            }

        }

        return result;

    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}
