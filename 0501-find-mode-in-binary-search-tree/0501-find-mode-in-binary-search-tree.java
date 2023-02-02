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
    public int[] findMode(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root.left == null && root.right == null) {
            return new int[]{root.val};
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(root.val, 1);
        count(root, map);

        Integer maxCount = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue().equals(maxCount)) {
                result.add(entrySet.getKey());
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
    
    public void count(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        
        if (root.left != null) {
            map.put(root.left.val, map.getOrDefault(root.left.val, 0) + 1);
            count(root.left, map);
        }
        
        if (root.right != null) {
            map.put(root.right.val, map.getOrDefault(root.right.val, 0) + 1);
            count(root.right, map);
        }
    }
    
}