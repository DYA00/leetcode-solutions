// Solution for the problem, Remove Nth Node From End of List in the Leetcode.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode finder = current;
        boolean found = false;

        // When n = 1 && only one node left.
        if (n == 1) {
            if (current.next == null) {
                return null;
            }
        }

        // Setting a pointer to detect a node that is away n nodes from the end.
        for (int i = 0; i < n; i ++) {
            finder = finder.next;
        }

        // When the first node should be removed.
        if (finder == null) {
            return current.next;
        }

        while(!found) {
            if (finder == null || finder.next == null) {
                found = true;
            }
            else {
                current = current.next;
                finder = finder.next;
            }
        }

        current.next = current.next.next;

        return head;
    }
}
