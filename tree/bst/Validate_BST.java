package tree.bst;

public class Validate_BST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // code optimized the monu bhaiya way
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return validate(root).isbst;
        }

        public Vpair validate(TreeNode root) {
            if (root == null)
                return new Vpair();
            Vpair lbp = validate(root.left);
            Vpair rbp = validate(root.right);
            Vpair sbp = new Vpair();
            sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
            sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
            sbp.isbst = lbp.isbst && rbp.isbst && root.val > lbp.max && root.val < rbp.min;
            return sbp;
        }
        // this class will have 3 data that will help us to optimize this code.
        class Vpair {
            boolean isbst = true;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
        }
    }
}