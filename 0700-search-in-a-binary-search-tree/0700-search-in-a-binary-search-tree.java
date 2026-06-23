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
    static void f(List<TreeNode> list,TreeNode root){
        if(root==null) return;
        list.add(root);
        f(list,root.right);
        f(list,root.left);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        List<TreeNode> list = new ArrayList<>();
        f(list,root);
        for(int i=0;i<list.size();i++){
            if(list.get(i).val==val) return list.get(i);
        }
        return null;
    }
    
}