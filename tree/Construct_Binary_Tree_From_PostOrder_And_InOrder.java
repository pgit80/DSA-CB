package tree;

public class Construct_Binary_Tree_From_PostOrder_And_InOrder {

    public static class Node {
        int data;
        Node left, right;

        Node() {
        }

        Node(int val) {
            this.data = val;
        }
    }

    class Solution {
        Node buildTree(int[] inorder, int[] postorder) {
            // code here
            return create(postorder, inorder, 0, inorder.length - 1, 0, postorder.length - 1);
        }

        public static Node create(int[] post, int[] in, int ilo, int ihi, int plo, int phi) {
            // base case
            if (ilo > ihi || plo > phi) {
                return null;
            }
            // last node of postorder is root of tree.
            Node node = new Node(post[phi]);

            // we need to search preorder node in inorder array and then create left-right
            // childern
            int idx = search(in, ilo, ihi, post[phi]);
            // we need to calculate the net elements in the inorder array to create new area for search in the tree and create left and right tree.
            int nel = idx - ilo;
            node.left = create(post, in, ilo, idx - 1, plo, plo + nel - 1);
            node.right = create(post, in, idx + 1, ihi, plo + nel, phi - 1);
            return node;
        }

        // to search the node in inorder array
        // in-> array
        // si-> start pointer of search area in inorder array
        // ei-> end pointer of search area in inorder array
        public static int search(int[] in, int si, int ei, int item) {
            for (int i = si; i <= ei; i++) {
                if (in[i] == item)
                    return i;
            }
            return 0;
        }
    }
}
