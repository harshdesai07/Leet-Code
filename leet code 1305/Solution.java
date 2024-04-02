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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();

        // inorder of tree 1
        TreeNode curr = root1;

        while (curr != null) {
            if (curr.left != null) {
                TreeNode pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                }

                if (pred.right == curr) {
                    pred.right = null;
                    a.add(curr.val);
                    curr = curr.right;
                }
            } else {
                a.add(curr.val);
                curr = curr.right;
            }
        }

        // inorder of tree 2
        curr = root2;

        while (curr != null) {
            if (curr.left != null) {
                TreeNode pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                }

                if (pred.right == curr) {
                    pred.right = null;
                    a.add(curr.val);
                    curr = curr.right;
                }
            } else {
                a.add(curr.val);
                curr = curr.right;
            }
        }

        Collections.sort(a);

        return a;
    }
}