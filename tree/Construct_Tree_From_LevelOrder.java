package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Construct_Tree_From_LevelOrder {
    /*
     * given level order input of a tree construct the tree from it.
     * The input format is space seperated integers
     * ex- 10 20 30 40 -1 -1 50 -1 -1 60 -1 -1 -1
     * 
     * approach- we'll use a queue
     * enqueue a value in queue-> dequeue it and create a node
     * next input 2 values those are left and right child of current node
     * enqueu next 2 values->dequeue them and make child node of first one
     * if a value is -1 then leave it.
     * when queue is empty after all this then our tree is constructed
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    TreeNode root;
    Scanner sc = new Scanner(System.in);

    public Construct_Tree_From_LevelOrder() {
        root = createTreeFromLevelOrder();
    }

    public TreeNode createTreeFromLevelOrder() {
        int item = sc.nextInt();
        TreeNode node = new TreeNode();
        node.val = item;
        root = node;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.remove();
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if (n1 != -1) {
                // build left node
                TreeNode x = new TreeNode();
                x.val = n1;
                temp.left = x;
                q.add(x);
            }
            if (n2 != -1) {
                // build left node
                TreeNode y = new TreeNode();
                y.val = n2;
                temp.right = y;
                q.add(y);
            }
        }
        return root;
    }

    // code to display the tree
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

    public static void main(String[] args) {
        Construct_Tree_From_LevelOrder ctree = new Construct_Tree_From_LevelOrder();
        ctree.postOrder();
    }

}
