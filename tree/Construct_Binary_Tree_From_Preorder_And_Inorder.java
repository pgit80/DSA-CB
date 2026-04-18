package tree;

public class Construct_Binary_Tree_From_Preorder_And_Inorder {

    /*
     * Given preorder and inorder of a binary tree, construct the whole tree from
     * it.
     * Approach will be - recognise the root from the preorder and childern from
     * inorder.
     * First element from the preorder array will be root of the tree(always).
     * Preorder= root->left->right
     * Inorder= left->root->right
     */

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    // we'll need the start and end pointers of both the arrays
    // ilo-> low pointer of inorder arr
    // ihi-> hi pointer of inorder arr
    // plo-> low pointer of preorder arr
    // phi-> hi pointer of preorder arr
    public TreeNode create(int[] pre, int[] in, int ilo, int ihi, int plo, int phi) {
        // base case-> when pointers cross each other
        if (ilo > ihi || plo > phi) {
            return null;
        }
        // first node of preorder is root of tree.
        TreeNode node = new TreeNode(pre[plo]);

        // we need to search preorder node in inorder array and then create left-right
        // childern
        int idx = search(in, ilo, ihi, pre[plo]);
        // index calculation in preorder
        int nel = idx-ilo;
        node.left = create(pre, in, ilo, idx - 1, plo+1, plo+nel);
        node.right = create(pre, in, idx + 1, ihi, plo+nel+1, phi);
        return node;
    }

    // to search the node in inorder array
    // in-> array
    // si-> start pointer of search area in inorder array
    // ei-> end pointer of search area in inorder array
    public int search(int[] in, int si, int ei, int item) {
        for (int i = si; i <= ei; i++) {
            if (in[i] == item)
                return i;
        }
        return 0;
    }

}
