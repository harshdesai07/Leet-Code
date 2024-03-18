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


public class leetcode450 {
    // function definition
    public TreeNode getMin(TreeNode node){
        while(node.left != null) node = node.left;

        return node;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        // search the key
        TreeNode curr = root;
        TreeNode parent = null;

        while(curr != null && curr.val != key){
            parent = curr;

            if(key < curr.val){
                // go left
                curr = curr.left;
            }
            else{
                // go right
                curr = curr.right;
            }
        }

        // key is not present
        if(curr == null) return root;

        // case 1: key has 0 children -> leaf node
        if(curr.left == null && curr.right == null){
            // to delete root
            if(curr == root) root = null;

            else{
                if(parent.left == curr) parent.left = null;
                else parent.right = null;
            }
        }

        // case 2: key has 1 child
        else if(curr.left == null || curr.right == null){
            TreeNode child;

            if(curr.left == null) child = curr.right;
            else child = curr.left;

            // to delete root
            if(curr == root) root = child;
            else{
                // linking parent with child whiole removing key node
                if(parent.left == curr) parent.left = child;
                else parent.right = child;
            }
        }

        // case 3: node with 2 children
        // deleted node can be replaced with the maximum of left subTree or minimum of right subTree
        else{
            // step 1: find right minimum
            TreeNode min = getMin(curr.right);
            int minVal = min.val;

            // step 2: delete right minimum
            deleteNode(root, minVal);

            // step 3: put curr.val = right minimum
            curr.val = minVal;
        }

        return root;
    }
}