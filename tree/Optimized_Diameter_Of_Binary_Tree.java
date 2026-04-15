package tree;

public class Optimized_Diameter_Of_Binary_Tree {
    /*
    calculating height in the previous approach is increasing our T(C)
     we solved this code in 2 recursive calls only.
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
        public DiaPair optimizeddiameterOfBinaryTree(TreeNode root){
            if(root==null){
                return new DiaPair(); // in case to return int return DiaPair().dt;
            } 
            DiaPair ldp=optimizeddiameterOfBinaryTree(root.left);
            DiaPair rdp=optimizeddiameterOfBinaryTree(root.right);
            DiaPair sdp=new DiaPair();
            int sd=ldp.ht+rdp.ht+2;
            sdp.dt=Math.max(sd, Math.max(ldp.dt, rdp.dt));
            sdp.ht=Math.max(ldp.ht, rdp.ht)+1;
            return sdp;
        }
        public int heightOfTree(TreeNode root){
            if(root==null) return -1;
            int lh=heightOfTree(root.left);
            int rh=heightOfTree(root.right);
            return Math.max(lh,rh)+1;
        }
    }
    // we're returning a pair of height and diameter
    // this class is helping to calculate diameter and height 
    class DiaPair{
        int dt=0;
        int ht=-1;
    }
}
