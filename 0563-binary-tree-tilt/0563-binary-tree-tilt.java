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
    public int findTilt(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            if (node != null) {
                int left = getSum(node.left, 0);
                int right = getSum(node.right, 0);
                list.add(Math.abs(left - right));
                nodes.offer(node.left);
                nodes.offer(node.right);
            }
        }

        return list.stream().reduce(0, Integer::sum);
    }
    
    private int getSum(TreeNode node, int total) {
        if (node == null) {
            return total;
        }

        int left = getSum(node.left, total);
        int right = getSum(node.right, total);

        total = total + node.val + left + right;
        return total;
    }
}