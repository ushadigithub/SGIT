
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }
    public class BinaryTree {

        TreeNode root;

        public BinaryTree() {
            root = null;
        }

        public void insert(int val) {
            root = insertRec(root, val);
        }

        private TreeNode insertRec(TreeNode root, int val) {
            if (root == null) {
                root = new TreeNode(val);
                return root;
            }

            if (val < root.val) {
                root.left = insertRec(root.left, val);
            } else if (val > root.val) {
                root.right = insertRec(root.right, val);
            }

            return root;
        }

        public void inorderTraversal() {
            inorderTraversalRec(root);
        }

        private void inorderTraversalRec(TreeNode root) {
            if (root != null) {
                inorderTraversalRec(root.left);
                System.out.print(root.val + " ");
                inorderTraversalRec(root.right);
            }
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();

            tree.insert(4);
            tree.insert(7);
            tree.insert(6);
            tree.insert(2);
            tree.insert(3);

            System.out.println("Inorder Traversal:");
            tree.inorderTraversal();
        }
    }

