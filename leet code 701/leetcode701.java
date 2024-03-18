class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class leetcode701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // base case
        if(root == null){
            // create the node 
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }

        if(root.val < val){
            // go to right
            root.right = insertIntoBST(root.right, val);
        }
        else{
            // go to left
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }
}
