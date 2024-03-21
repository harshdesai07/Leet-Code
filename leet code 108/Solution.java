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
    public TreeNode helper(int[] nums, int l, int r) {
        if (l > r)
            return null;

        int mid = l + (r - l) / 2;

        // create root
        TreeNode root = new TreeNode(nums[mid]);

        // create left child
        root.left = helper(nums, l, mid - 1);

        // create right child
        root.right = helper(nums, mid + 1, r);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
}