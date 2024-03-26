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

class Solution {
    // public int height(TreeNode root){
    // if(root == null) return 0;
    // return 1 + Math.max(height(root.left), height(root.right));
    // }

    // public void preOrder(TreeNode root, List<Integer> al, int level){
    // if(root == null) return;

    // al.set(level-1, root.val);

    // preOrder(root.left, al, level+1);
    // preOrder(root.right, al, level+1);
    // }

    public void helper(TreeNode root, List<Integer> al, int level) {
        if (root == null)
            return;
        if (al.size() == level)
            al.add(root.val);
        if (root.right != null)
            helper(root.right, al, level + 1);
        if (root.left != null)
            helper(root.left, al, level + 1);

    }

    public List<Integer> rightSideView(TreeNode root) {
        // Method 1: LOT
        // List<Integer> ans = new ArrayList<>();

        // if(root == null) return ans;

        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);

        // while(q.size() > 0){
        // int n = q.size();

        // for(int i=1; i<=n; i++){
        // TreeNode node = q.remove();

        // if(node.left != null) q.add(node.left);
        // if(node.right != null) q.add(node.right);
        // if(i == n) ans.add(node.val);
        // }
        // }

        // return ans;

        // Method 2: PreOrder
        // int level = height(root);
        // List<Integer> ans = new ArrayList<>();

        // for(int i=0; i<level; i++){
        // ans.add(0);
        // }

        // preOrder(root, ans, 1);

        // return ans;

        // Method 3
        List<Integer> ans = new ArrayList<>();
        helper(root, ans, 0);

        return ans;

    }
}