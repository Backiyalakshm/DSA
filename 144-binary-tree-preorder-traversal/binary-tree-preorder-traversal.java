class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    private void helper(TreeNode node, List<Integer> ans) {
        if (node == null) {
            return;
        }

        ans.add(node.val);           // Visit root
        helper(node.left, ans);      // Traverse left subtree
        helper(node.right, ans);     // Traverse right subtree
    }
}
