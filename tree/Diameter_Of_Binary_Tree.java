package tree;
public class Diameter_Of_Binary_Tree{

    /*
    Diameter of tree=> length of longest path between any two nodes. (may including root or not)

    Approach-> There are two conditions
    1. diameter pass through root of tree in this case diameter=left subtree height+right Subtree height+2
    2. diameter not pass through tree in this case max of left diameter and right diameter

    T(C)=O(n^2)
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

    class solution{
        public int diameterOfBinaryTree(TreeNode root){
            if(root==null) return 0;
            int ld=diameterOfBinaryTree(root.left);
            int rd=diameterOfBinaryTree(root.right);
            int sd=heightOfTree(root.left)+heightOfTree(root.right)+2;
            return Math.max(rd,Math.max(ld, sd));
        }
        public int heightOfTree(TreeNode root){
            if(root==null) return -1;
            int lh=heightOfTree(root.left);
            int rh=heightOfTree(root.right);
            return Math.max(lh,rh)+1;
        }
    }
}