//Floor in BST

class Solution {
    static int ans = -1;
    public static int floor(Node root, int x) {
        ans = -1;
        helper(root, x);
        return ans;
    }
    public static void helper(Node node, int target) {
        if(node == null) return;
        if(node.data <= target) ans = Math.max(ans, node.data);
        helper(node.left, target);
        helper(node.right, target);
    }
}