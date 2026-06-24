//Solution for the problem, Palindrome Linked List in the leetcode.
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        ListNode reverse = null;
        while (slow != null) {
            reverse = new ListNode(slow.val, reverse);
            slow = slow.next;
        }

        ListNode current = head;
        while (reverse != null) {
            if (current.val != reverse.val) {
                return false;
            }

            current = current.next;
            reverse = reverse.next;
        }

        return true;
    }
}
