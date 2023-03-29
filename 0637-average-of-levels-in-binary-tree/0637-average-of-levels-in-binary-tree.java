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
    public List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        fillTheMap(map, root, 1);

        List<Double> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            long sum = entry.getValue()
                    .stream()
                    .mapToLong(Long::valueOf)
                    .sum();

            double average = (double) sum / entry.getValue().size();

            result.add(Math.round(average * 100000d) / 100000d);
        }

        return result;
    }
    
    private int fillTheMap(Map<Integer, List<Integer>> map, TreeNode node, int level) {
        if (node == null) {
            return level--;
        }

        if (map.containsKey(level)) {
            List<Integer> list = map.get(level);
            list.add(node.val);
            map.put(level, list);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            map.put(level, list);
        }

        int left = fillTheMap(map, node.left, level + 1);

        int right = fillTheMap(map, node.right, level + 1);

        level--;

        return level;
    }
}