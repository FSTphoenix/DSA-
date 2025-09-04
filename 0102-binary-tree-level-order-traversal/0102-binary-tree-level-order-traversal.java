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
    public List<List<Integer>> levelOrder(TreeNode n) {
        Queue<TreeNode> q = new LinkedList<>();  
        List<List<Integer>> l = new ArrayList<>();       

        if (n == null) return l;
    
        q.offer(n);  
    
        while (!q.isEmpty()) {
            int level = q.size();       
            List<Integer> curr = new ArrayList<>();  
        
            for (int i = 0; i < level; i++) {
                TreeNode node = q.poll();   
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
                curr.add(node.val);
            }
        
            l.add(curr);  
        }
        return l;
    }
}