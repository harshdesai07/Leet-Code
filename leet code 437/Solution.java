import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;

        Map<Long, Integer> map = new HashMap<>();
        map.put(0l, 1);
        return helper(root, 0l, targetSum, map);
    }

    public int helper(TreeNode root, Long current, int target, Map<Long, Integer> map) {
        if (root == null)
            return 0;

        current += (long) root.val;
        int count = 0;

        count += map.getOrDefault(current - target, 0);
        map.put(current, map.getOrDefault(current, 0) + 1);

        count += helper(root.left, current, target, map);
        count += helper(root.right, current, target, map);

        map.put(current, map.get(current) - 1);
        return count;
    }
}