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
    public TreeNode getNode(TreeNode root, int start) {
        if (root == null)
            return null;

        if (root.val == start)
            return root;

        TreeNode left = getNode(root.left, start);
        TreeNode right = getNode(root.right, start);

        return (left == null) ? right : left;
    }

    public void preorder(TreeNode root, Map<TreeNode, TreeNode> p) {
        if (root == null)
            return;

        if (root.left != null)
            p.put(root.left, root);
        if (root.right != null)
            p.put(root.right, root);

        preorder(root.left, p);
        preorder(root.right, p);
    }

    public int amountOfTime(TreeNode root, int start) {
        TreeNode node = getNode(root, start);
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        preorder(root, parent);

        // bfs
        Queue<TreeNode> q = new LinkedList<>();
        Map<TreeNode, Integer> infected = new HashMap<>();

        infected.put(node, 0);
        q.add(node);

        while (q.size() > 0) {
            TreeNode temp = q.remove();

            // check for left
            if (temp.left != null && !infected.containsKey(temp.left)) {
                q.add(temp.left);
                infected.put(temp.left, infected.get(temp) + 1);
            }

            // check for right
            if (temp.right != null && !infected.containsKey(temp.right)) {
                q.add(temp.right);
                infected.put(temp.right, infected.get(temp) + 1);
            }

            // check for parent
            if (parent.containsKey(temp) && !infected.containsKey(parent.get(temp))) {
                q.add(parent.get(temp));
                infected.put(parent.get(temp), infected.get(temp) + 1);
            }
        }

        int ans = 0;
        for (int i : infected.values()) {
            ans = Math.max(ans, i);
        }

        return ans;

    }
}