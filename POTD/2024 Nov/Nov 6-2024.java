class Solution {
    public static int treePathsSum(Node root) {
        return myFunction(root, 0);
    }
    public static int myFunction(Node root, int sum) {
        if (root == null) return 0;
        sum = sum * 10 + root.data;
        if (root.left == null && root.right == null) return sum;
        return myFunction(root.left, sum) + myFunction(root.right, sum);
    }
}