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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        List<TreeNode> validHeads = new ArrayList<>();
        findValidHeads(root, subRoot, validHeads);

        if (validHeads.isEmpty()) {
            return false;
        } else {
            for (TreeNode treeNode : validHeads) {
                if (isEqual(treeNode, subRoot)) {
                    return true;
                }
            }
        }

        return false;
    }
    
    private void findValidHeads(TreeNode root, TreeNode subRoot, List<TreeNode> validHeads) {
        if (root == null) {
            return;
        }

        if (root.val == subRoot.val) {
            validHeads.add(root);
        }

        findValidHeads(root.left, subRoot, validHeads);
        findValidHeads(root.right, subRoot, validHeads);
    }
    
    private boolean isEqual(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null) {
            return false;
        }

        if (root.val == subRoot.val) {
            return isEqual(root.left, subRoot.left) && isEqual(root.right, subRoot.right);
        } else {
            return false;
        }
    }
}