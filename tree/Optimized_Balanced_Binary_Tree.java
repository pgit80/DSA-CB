package tree;

public class Optimized_Balanced_Binary_Tree {

    /*
    this is O(n) code
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
    class Solution{


        // this pair class we are using to optimize our code
        
        public BalPair optimizedIsBalanced(TreeNode root){
            if(root == null) {
                return new BalPair();
            }
            BalPair l = optimizedIsBalanced(root.left);
            BalPair r = optimizedIsBalanced(root.right);
            BalPair bp = new BalPair();
            // calculating height here
            bp.ht=Math.max(l.ht, r.ht)+1;
            boolean h = Math.abs(l.ht-r.ht)<=1;
            bp.bal= l.bal && r.bal && h;
            return bp;
        }

        class BalPair{
            int ht=-1;
            boolean bal=true;
        }

    }
}
