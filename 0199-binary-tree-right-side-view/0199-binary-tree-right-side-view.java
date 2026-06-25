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
    static void f(TreeNode root,List<Integer> l,int lvl){
        if(root==null) return;
        if(l.size()==lvl){
            l.add(root.val);
        }
        f(root.right,l,lvl+1);
        f(root.left,l,lvl+1);

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        f(root,l,0);
        return l;
    }
}