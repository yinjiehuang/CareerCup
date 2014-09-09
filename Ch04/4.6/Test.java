// Write an algorithm to find the 'next' node (i.e., in-order successor) of a given node in a binary search tree. You may assume that each node has a link to its parent.
// Intro to Algorithm has this feature built in in BST, called succssor...
// It is good to go over this again.

public class Test {
        public static void main(String[] args) {
                System.out.println("CareerCup 4.6!!!");
                TreeNode tn = new TreeNode(9);
                tn.insert(tn, 4);
                tn.insert(tn, 5);
                tn.insert(tn, 10);
                tn.insert(tn, 1);
                tn.insert(tn, 2);

                System.out.println(tn.min(tn).key);
                System.out.println(tn.successor(tn).key);
        }
}

class TreeNode {
        public int key;
        public TreeNode p;
        public TreeNode left;
        public TreeNode right;

        public TreeNode (int key) {
                this.key = key;
                this.p = null;
                this.left = null;
                this.right = null;
        }

        public TreeNode successor(TreeNode root) {
                if (root == null) {
                        return null;
                }

                if (root.right != null) {
                        return min(root.right);
                } else {
                        TreeNode x = root;
                        TreeNode p = x.p;
                        while (x != null && x != p.left) {
                                x = p;
                                p = x.p;
                        }
                        return x;
                }
        }

        public TreeNode insert(TreeNode root, int n) {
                if (root == null) {
                        return new TreeNode(n);
                }

                if (n <= root.key) {
                        root.left = insert(root.left, n);
                        root.left.p = root;
                } else {
                        root.right = insert(root.right, n);
                        root.right.p = root;
                }

                return root;
        }

        public TreeNode min(TreeNode root) {
                if (root == null) {
                        return null;
                }

                while (root.left != null) {
                        root = root.left;
                }
                return root;
        }
}

