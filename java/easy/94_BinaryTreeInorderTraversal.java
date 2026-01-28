//Solution for the problem, Binary Tree Inorder Traversal in the leetcode.
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        traverse(root, inorder);

        return inorder;
    }

    public void traverse(TreeNode node, List<Integer> result) {
        //When current Node is null, quit the recursion.
        if (node == null) {
            return;
        }

        //Due to it is inorder, getting left node first.
        traverse(node.left, result);

        //After the left side, add current value.
        result.add(node.val);

        //Then, going to the right node.
        traverse(node.right, result);
    }
}
