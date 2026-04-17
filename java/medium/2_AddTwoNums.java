//Solution for the problem, Add Two Numbers in leetcode.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode cover = result;
        boolean over = false;
        
        
        while (l1 != null || l2 != null) {
            int current = 0;
            if (l1 != null) {
                current += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                current += l2.val;
                l2 = l2.next;
            }

            if (over == true) {
                current++;
                over = false;
            }

            if (current > 9) {
                over = true;
                current = current % 10;
            }

            ListNode add = new ListNode(current);
            cover.next = add;
            cover = cover.next;
        }

        if(over) {
            cover.next = new ListNode(1);
        }

        return result.next;
    }
}
