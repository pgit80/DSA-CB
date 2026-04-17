package tree.bst;

public class Delete_In_BST {

    /*
     * 1. first find the key in bst
     * 2. if found delete the key and return the reference
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        // deletion code
        if (root.val == key) {
            // there are 3 conditions
            // 1. leaf node -> put null
            // 2. 0 or 1 child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            // 3. 2 child
            else{
                int max=maxElementInBST(root.left);
                root.left=deleteNode(root.left, max);
                root.val=max;
            }
        }
        // right call
        else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        // left call
        else {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

    public int maxElementInBST(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int mx = maxElementInBST(root.right);
        return Math.max(mx, root.val);
    }
}
