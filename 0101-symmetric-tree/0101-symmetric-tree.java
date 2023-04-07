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
    public boolean isSymmetric(TreeNode root) {
        TreeNode right = switchRoots(root.right);
        TreeNode left = root.left;

        return equals(right, left);
    }
    
    private TreeNode switchRoots(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        switchRoots(root.left);
        switchRoots(root.right);
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        return root;
    }
    
    private boolean equals(TreeNode right, TreeNode left) {
        if (right == null && left == null) {
            return true;
        } else if (right == null || left == null) {
            return false;
        }

        if (right.val != left.val) {
            return false;
        }

        boolean a = equals(right.right, left.right);
        boolean b = equals(right.left, left.left);
        return a && b;
    }
}