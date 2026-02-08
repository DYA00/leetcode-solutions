//Solution for the problem, Blanced Binary Tree in the leetcode.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;

        int leftSide = height(root.left);
        if (leftSide == -1) return -1;
        
        int rightSide = height(root.right);
        if (rightSide == -1) return -1;

        if (Math.abs(leftSide - rightSide) > 1) return -1;

        return Math.max(leftSide,rightSide) + 1;
    }
}
