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

public class Solution {
    // // inorder
    // public void helper(TreeNode root, ArrayList<Integer> al) {
    //     // base case
    //     if(root == null) return;

    //     helper(root.left, al);
    //     al.add(root.val);
    //     helper(root.right, al);
    // }

    // Method 2
     // inorder
     int count = 0;
     int ans;
    public void helper(TreeNode root, int k) {
        // base case
        if(root == null) return;

        helper(root.left, k);
        count++;
        if(count == k){
            ans = root.val;
            return;
        }
        helper(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;
    }
}

