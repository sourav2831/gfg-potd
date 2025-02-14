class Solution {
    Node first = null, second = null, prev = null;
    void correctBST(Node root) {
        inorderTraversal(root);
        if (first != null && second != null) {
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
    }

    private void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        if (prev != null && prev.data > root.data) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;
        inorderTraversal(root.right);
    }
}
