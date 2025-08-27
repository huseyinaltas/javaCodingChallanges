package algorithms;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        node1.val = 1;
        node2.val = 2;
        node3.val = 3;
        node1.next = node2;
        node2.next = node3;

        ListNode reversedHead = node1.reverseList1(node1);
        System.out.print("Reversed linked list: ");
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
        // output: Reversed linked list: 3 2 1
    }

    public ListNode reverseList1(ListNode head) {
        return null;
    }
}
