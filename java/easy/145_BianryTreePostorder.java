//Solution for the problem, Binary Tree Postorder Traversal in the leetcode.
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post = new ArrayList<>();
        dfs(root, post);
        return post;
    }

    private void dfs(TreeNode root, List<Integer> result) {
        if (root != null) {
            dfs(root.left, result);
            dfs(root.right, result);
            result.add(root.val);
        }
    }
}
