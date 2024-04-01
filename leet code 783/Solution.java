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

class Solution {
    int ans = Integer.MAX_VALUE;
    TreeNode prev = null;

    public void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        if (prev != null) {
            int temp = Math.abs(root.val - prev.val);
            ans = Math.min(ans, temp);
        }
        prev = root;
        inorder(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;
    }
}