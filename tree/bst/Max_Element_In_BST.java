package tree.bst;

public class Max_Element_In_BST {
    /*
     * in bst we already know that data is put accroding to value of element
     * so a maximum value will occur in right subtree
     * so there is no need for left subtree call in max element case
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public int maxElementInBST(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int mx = maxElementInBST(root.right);
        return Math.max(mx, root.val);
    }
}
