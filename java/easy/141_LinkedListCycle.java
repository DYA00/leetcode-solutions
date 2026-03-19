//Solution for the problem, linked list cycle, asking to determine the existence of loop in the linked cycle in the leetcode.
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ListNode fast = head;

        while (fast != null && fast.next != null) {
            head = head.next;
            fast = fast.next.next;
            if (head == fast) {
                return true;
            }
        }
    
        return false;
    }
}
