//Solution for the problem, Remove Linked List Elements in the leetcode.
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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode cover = head;

        while (cover != null && cover.next != null) {
            if (cover.next.val == val) {
                cover.next = cover.next.next;
            } else {
                cover = cover.next;
            }
        }

        return head;
    }
}
