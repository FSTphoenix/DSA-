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
    static TreeNode f(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val>root.val){
            root.right=f(root.right,val);
        }    
        else {
            root.left=f(root.left,val);
        }  
        return root;  
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return f(root,val);
    }
}