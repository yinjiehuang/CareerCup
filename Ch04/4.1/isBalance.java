// Implement a function to check if a binary tree is balanced. For the purposes of this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ by more than one.

class isBalance {
        public static void main(String[] args) {
                System.out.println("CareerCup 4.1!!!");
                TreeNode tn = new TreeNode(9);
                tn.insert(tn, 4);
                tn.insert(tn, 5);
                tn.insert(tn, 10);
                tn.insert(tn, 1);
                tn.insert(tn, 2);
        
                isBalance ib = new isBalance();
                System.out.println(ib.run(tn));
	}

        public int getHeight(TreeNode root) {
                if (root == null) {
                        return 0;
                }
                return Math.max(getHeight(root.left),getHeight(root.right)) + 1;
        }

        public boolean run(TreeNode root) {
                if (root == null) {
                        return true;
                }
                int HeighDiff = getHeight(root.left) - getHeight(root.right);
                if (Math.abs(HeighDiff) > 1) {
                        return false;
                } else {
                        return run(root.left) && run(root.right);
                }
        }
}

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
                this.val = val;
                this.left = null;
                this.right = null;
        }

        public TreeNode insert(TreeNode root, int n) {
                if (root == null) {
                        return new TreeNode(n);
                }

                if (root.val > n) {
                        root.left = insert(root.left, n);
                } else {
                        root.right = insert(root.right, n);
                }
                return root;
        }
}
