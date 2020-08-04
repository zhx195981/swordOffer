package ListNode;

import java.util.LinkedList;

public class reverseListk {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        LinkedList<ListNode> ls = new LinkedList();
        ListNode first = null;
        ListNode tmp = null;
        while (head != null) {

            ls.add(head);
            head = head.next;
            if(ls.size() == k){
                if(first == null){
                    first = ls.pollLast();
                    tmp = first;
                    while(ls.size() != 0) {
                        first.next = ls.pollLast();
                        first = first.next;

                    }

                }else{
                    while(ls.size() != 0) {
                        first.next = ls.pollLast();
                        first = first.next;

                    }
                }
                first.next = null;
            }



        }

        if (ls.size() != 0) {
            first.next = ls.pollFirst();
            first = first.next;
        }
        return tmp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node = head;
        for (int i = 2; i <= 10; i++) {
            ListNode listNode = new ListNode(i);
            node.next = listNode;
            node = node.next;
        }
        ListNode a =  reverseKGroup(head, 3);
        while(a != null){
            System.out.print(a.val + " ");
            a = a.next;
        }

    }
}
