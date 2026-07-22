// Solution for the problem, Swap Nodes in Pairs in the leetcode.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode result = head.next;
        ListNode prev = head;
        ListNode current = head.next;
        ListNode temp = head.next.next;

        while (temp != null && temp.next != null) {
            current.next = prev;
            prev.next = temp.next;
            prev = temp;
            current = temp.next;
            temp = temp.next.next;
        }

        if (current != null) {
            current.next = prev;
            prev.next = temp;
        }

        return result;
    }
}
