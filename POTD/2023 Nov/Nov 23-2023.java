//AVL Tree Insertion

class Solution {
    public Node insertToAVL(Node root, int data) {
        if (root == null)return new Node(data);
        if (data < root.data) root.left = insertToAVL(root.left, data);
        else if (data > root.data) root.right = insertToAVL(root.right, data);
        else return root;
        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);
        if (balance > 1 && data < root.left.data) return rightRotate(root);
        if (balance < -1 && data > root.right.data) return leftRotate(root);
        if (balance > 1 && data > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && data < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    private int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }
    private int getBalance(Node node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return x;
    }
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }
} 