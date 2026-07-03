//Solution for the problem, Binary Tree Paths in the Leetcode.
class Solution {
    List<String> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return result;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        path.add(node.val);

        if (node.left == null && node.right == null) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < path.size(); i++) {
                sb.append(path.get(i));
                if (i != path.size() - 1) {
                    sb.append("->");
                }
            }

            result.add(sb.toString());
        }

        dfs(node.left);
        dfs(node.right);

        path.remove(path.size() - 1);
    }
}
