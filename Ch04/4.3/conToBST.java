// Given a sorted (increasing order) array with unique integer elements, write an algorithm to create a binary search tree with minimal height

import java.util.*;

class conToBST {
        public static void main(String[] args) {
                System.out.println("CareerCup 4.3!!!");
                int[] num = new int[]{1,4,5,7,9,10};
                conToBST ctb = new conToBST();
                TreeNode tn = ctb.sortedArrayToBST(num);
                System.out.println(tn.val);
        }

        public TreeNode sortedArrayToBST(int[] num) {
                if (num.length == 0) {
                        return null;
                }
                return help(num, 0, num.length-1);
        }

        public TreeNode help(int[] num, int n1, int n2) {
                if (n1 > n2) {
                        return null;
                }
                int mid = (n1 + n2) / 2;
                TreeNode tn = new TreeNode(num[mid]);
                tn.left = help(num, n1, mid-1);
                tn.right = help(num, mid+1, n2);
                return tn;
        }
}

class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
                this.val = val;
                this.left = null;
                this.right = null;
        }
}
