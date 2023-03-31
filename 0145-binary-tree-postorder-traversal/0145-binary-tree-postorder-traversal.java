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
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                result.addFirst(node.val);
                node = node.right;
            } else {
                TreeNode treeNode = stack.pop();
                node = treeNode.left;
            }

        }

        return result;
    }
}