// Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.
//

public class Test {
        public static void main(String[] args) {
                System.out.println("CareerCup 4.7!!!");
                TreeNode tn = new TreeNode(9);
                tn.insert(tn, 4);
                tn.insert(tn, 5);
                tn.insert(tn, 10);
                tn.insert(tn, 1);
                tn.insert(tn, 2);
                isAncestor ia = new isAncestor();
                System.out.println(ia.run(tn,4,10).key);
        }
}

class isAncestor {
        public TreeNode run(TreeNode root, int p, int q) {
                if (!cover(root,p) || !cover(root,q)) {
                        return null;
                }
                return common(root, p, q);
        }

        public TreeNode common(TreeNode root, int p, int q) {
                if (root == null) {
                        return null;
                }

                if (root.key == p || root.key == q) {
                        return root;
                }

                boolean isleftp = cover(root.left,p);
                boolean isleftq = cover(root.left,q);

                if (isleftp != isleftq) {
                        return root;
                }
                TreeNode temp;
                if (isleftp) {
                        temp = root.left;
                } else {
                        temp = root.right;
                }

                return common(temp,p,q);
        }

        public boolean cover(TreeNode root, int p) {
                if (root == null) {
                        return false;
                }

                if (root.key == p) {
                        return true;
                }

                return cover(root.left, p) || cover(root.right, p);
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

                if (n < root.key) {
                        root.left = insert(root.left, n);
                } else {
                        root.right = insert(root.right, n);
                }
                return root;
        }
}
