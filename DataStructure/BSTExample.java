public class BSTExample {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        // L V R
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public static void call() {
        int arr[] = {1, 3, 2, 7, 5, 4, 9, 100, 1, 9};
        Node root = null;
        for (int num : arr) {
            root = insert(root, num);
        }
        // preorder traversal
        inorder(root);
    }
}
