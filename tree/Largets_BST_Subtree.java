package tree;

public class Largets_BST_Subtree {
    /*
     * LC- 1373 is same as this (not hard as given in tag)
     * LC-333 (Premium question)
     * Given the root of a binary tree, find the largest subtree, which is also a
     * BST, where the largest
     * means subtree has the largest number of nodes.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // code of this question is same as validate bst, we just need an additional
    // data 'size'
    class Solution {
        public int largestBST(TreeNode root) {
            return solve(root).size;
        }

        public Vpair solve(TreeNode root) {
            if (root == null)
                return new Vpair();
            Vpair lbp = solve(root.left);
            Vpair rbp = solve(root.right);
            Vpair sbp = new Vpair();
            sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
            sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
            sbp.isbst = lbp.isbst && rbp.isbst && root.val > lbp.max && root.val < rbp.min;
            if (sbp.isbst) {
                sbp.size = lbp.size + rbp.size + 1;
            } else {
                sbp.size = Math.max(lbp.size, rbp.size);
            }
            return sbp;
        }

        // this class will have 3 data that will help us to optimize this code.
        class Vpair {
            boolean isbst = true;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            // a new size data will be neded
            int size = 0;
        }
    }
}
