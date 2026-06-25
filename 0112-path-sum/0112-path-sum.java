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
    public boolean hasPathSum(TreeNode root, int tSum) {
        if(root==null) return false;
        tSum-=root.val;
        if(root.left==null && root.right==null){
            return tSum==0;
        }
        boolean l=hasPathSum(root.left,tSum);
        boolean r=hasPathSum(root.right,tSum);
        return l || r;
    }
}