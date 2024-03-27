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
    public void helper(TreeNode root, int targetSum, int sum, List<Integer> al, List<List<Integer>> ans) {
        if (root == null)
            return;

        sum += root.val;
        al.add(root.val);

        if (root.left == null && root.right == null && sum == targetSum) {
            ans.add(new ArrayList<>(al));

        } else {
            helper(root.left, targetSum, sum, al, ans);
            helper(root.right, targetSum, sum, al, ans);
        }

        al.remove(al.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        helper(root, targetSum, 0, al, ans);
        return ans;
    }
}
