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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // base case
        if (root == null) {
            // create the node
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }

        if (root.val < val) {
            // go to right
            root.right = insertIntoBST(root.right, val);
        } else {
            // go to left
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++) {
            root = insertIntoBST(root, preorder[i]);
        }

        return root;
    }
}