// Implement a function to check if a binary tree is a binary search tree
// My first idea is a classic mistake...Now I understand...
// There are two methods to accomplish this!!!
// The narrowing down of min & max procedure is easy and decent.

import java.util.*;

class isBalance {
        public static void main(String[] args) {
                System.out.println("CareerCup 4.5!!!");
                TreeNode tn = new TreeNode(9);
                tn.insert(tn, 4);
                tn.insert(tn, 5);
                tn.insert(tn, 10);
                tn.insert(tn, 1);
                tn.insert(tn, 2);

                isBalance ib = new isBalance();
                System.out.println(ib.checkBST(tn, Integer.MIN_VALUE, Integer.MAX_VALUE));
        }

        public boolean checkBST(TreeNode root, int min, int max) {
                if (root == null) {
                        return true;
                }

                if (root.key <=min || root.key > max) {
                        return false;
                }

                if (!checkBST(root.left, min, root.key) || !checkBST(root.right, root.key, max)) {
                        return false;
                }

                return true;
        }
}

class TreeNode {
        public int key;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int key) {
                this.key = key;
                this.left = null;
                this.right = null;
        }

        public TreeNode insert(TreeNode root, int n) {
                if (root == null) {
                        return new TreeNode(n);
                }

                if (root.key > n) {
                        root.left = insert(root.left, n);
                } else {
                        root.right = insert(root.right, n);
                }
                
                return root;
        }
}
