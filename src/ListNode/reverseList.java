package ListNode;

import java.util.LinkedList;

public class reverseList {
    public static ListNode reverseList1(ListNode head) {
        ListNode temp = null;
        ListNode next;
        while(head != null){
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }
    public static ListNode reverseList2(ListNode head) {
        LinkedList<ListNode> ls = new LinkedList();
        while(head!=null){
            ListNode tmp = head;
            ls.add(head);
            head = head.next;
            tmp.next = null;
        }
        ListNode temp = ls.pollLast();
        ListNode head1 = temp;
        while(ls.size() != 0){
            head1.next = ls.pollLast();
            head1 = head1.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node = head;
        for (int i = 2; i <= 10; i++) {
            ListNode listNode = new ListNode(i);
            node.next = listNode;
            node = node.next;
        }
        ListNode a =  reverseList1(head);
        while(a != null){
            System.out.print(a.val + " ");
            a = a.next;
        }

    }
}
