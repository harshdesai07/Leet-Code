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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && targetSum - root.val == 0) return true;

        // go left
        boolean left = hasPathSum(root.left, targetSum-root.val);

        // go right
        boolean right = hasPathSum(root.right, targetSum-root.val);

        return left || right;
    }
}
