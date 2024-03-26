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
    public TreeNode helper (int[] preorder, int[] inorder, int preL, int preH, int inL, int inH){
        if(preL > preH) return null;

        TreeNode node = new TreeNode(preorder[preL]);
        int i = inL;

        while(inorder[i] != preorder[preL]) i++;

        int leftsize = i-inL;

        node.left = helper (preorder, inorder, preL+1, preL+leftsize, inL, i-1);
        node.right = helper (preorder, inorder, preL+leftsize+1, preH, i+1, inH);

       return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;

        return helper(preorder, inorder, 0, n-1, 0, n-1);
    }
}
