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
    int tilt = 0;
    
    public int findTilt(TreeNode root) {
        getSum(root);
        return tilt;
    }
    
    private int getSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getSum(node.left);
        int right = getSum(node.right);


        tilt = tilt + Math.abs(left - right);
        return left + right + node.val;
    }
}