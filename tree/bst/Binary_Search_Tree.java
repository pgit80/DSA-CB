package tree.bst;

import java.util.Scanner;

public class Binary_Search_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    TreeNode root;

    Scanner sc = new Scanner(System.in);

    public Binary_Search_Tree(int[] in) {
        root = createBSTfromInorder(in, 0, in.length-1);
    }

    public Binary_Search_Tree() {
    }

    // this method will create bst from given inorder traversal
    public TreeNode createBSTfromInorder(int[] in, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        TreeNode nn = new TreeNode();
        nn.val = in[mid];
        nn.left = createBSTfromInorder(in, si, mid - 1);
        nn.right = createBSTfromInorder(in, mid + 1, ei);
        return nn;
    }

    // postorder code is for display bst
    public void postOrder() {
        postOrder(this.root);
        System.out.println();
    }

    private void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
}
