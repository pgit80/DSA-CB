package tree.bst;

public class Min_Element_In_BST {
    /*
     * in bst we already know that data is put accroding to value of element
     * so a minimum value will occur in left subtree
     * so there is no need for right subtree call in min element case
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public int maxElementInBST(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;
        int mx = maxElementInBST(root.left);
        return Math.max(mx, root.val);
    }
}
