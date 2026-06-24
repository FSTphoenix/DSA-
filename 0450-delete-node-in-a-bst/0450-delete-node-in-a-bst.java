class Solution {

    static int getmin(TreeNode root){
        if(root.left == null) return root.val;
        return getmin(root.left);
    }

    static TreeNode f(TreeNode root, int key){

        if(root == null) return null;

        if(root.val == key){

            if(root.left == null && root.right == null){
                return null;
            }

            else if(root.left == null){
                return root.right;
            }

            else if(root.right == null){
                return root.left;
            }

            else{
                int min = getmin(root.right);
                root.val = min;
                root.right = f(root.right, min);
            }
        }

        else if(key > root.val){
            root.right = f(root.right, key);
        }

        else{
            root.left = f(root.left, key);
        }

        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        return f(root, key);
    }
}