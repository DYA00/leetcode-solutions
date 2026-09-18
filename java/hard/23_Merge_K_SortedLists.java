// Solution for the problem, Merge K Sorted Lists in the leetcode.

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
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, null, null);
    }

    private ListNode merge(ListNode[] lists, ListNode result, ListNode lastNode) {
        int minIndex = -1;

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && (minIndex == -1 || lists[i].val < lists[minIndex].val)) {
                minIndex = i;
            }
        }

        if (minIndex == -1) {
            return result;
        }

        ListNode current = lists[minIndex];
        lists[minIndex] = lists[minIndex].next;

        if (result == null) {
            result = current;
            lastNode = current;
        }
        else {
            lastNode.next = current;
            lastNode = current;
        }

        return merge(lists, result, lastNode);
    }
}
