package tree.bst;

public class Insert_In_BST {
    /*
     * leetcode 701
     * You are given the root node of a binary search tree (BST) and a value to
     * insert into the tree. Return the root node of the BST after the insertion. It
     * is guaranteed that the new value does not exist in the original BST.
     * 
     * Approach- search for the node of given value, it will not fall in tree but
     * there will be a place where this value falls correct there just create a new
     * node connect it with tree and return that node
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        // where root is null that is our correct spot and create a new node there
        if (root == null) {
            return new TreeNode(val);
        }
        // agar value bada hai to right me jake right spot find kro
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        // agar value chota hai to left me jake correct spot find kro
        else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

}
