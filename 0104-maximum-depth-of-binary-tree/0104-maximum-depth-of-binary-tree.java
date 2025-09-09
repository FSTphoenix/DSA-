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
    static int max(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = max(root.left);
        int rightDepth = max(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int maxDepth(TreeNode root) {
        int x =max(root);
        return x;
    }
}