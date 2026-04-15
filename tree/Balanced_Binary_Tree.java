package tree;

public class Balanced_Binary_Tree {
    /*
    A balanced binary tree is a tree which->
    for each node |leftHeight-rightHeight|<=1 and left and right subtree are also balanced

    T(C)=O(n^2);
    */

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right)
        {
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public static boolean isBalanced(TreeNode root){
        if(root==null) return true; 
        // left balance hona chahiye
        boolean lb = isBalanced(root.left);
        // right balance hona chahiye
        boolean rb = isBalanced(root.right);
        // leftheight - rightheight <=1 hona chahiye
        boolean sb = Math.abs(height(root.left)-height(root.right))<=1;
        // all thre conditions should be true 
        return lb&&sb&&rb;
    }

    public static int height(TreeNode root){
        if(root==null) return -1;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
}
