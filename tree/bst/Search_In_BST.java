package tree.bst;

public class Search_In_BST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean searchInBST(int item, TreeNode root) {
        if (root.val == item) {
            return true;
        } else if (item < root.val) {
            return searchInBST(item, root.left);
        } else {
            return searchInBST(item, root.right);
        }
    }
}
