class Solution {
    static int preIndex = 0;
    
    public static Node buildTree(int[] inorder, int[] preorder) {
        preIndex = 0; // Reset preIndex for every new call
        return buildTreeUtil(inorder, preorder, 0, inorder.length - 1);
    }
    
    private static Node buildTreeUtil(int[] inorder, int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        
        Node root = new Node(preorder[preIndex++]);
        
        if (inStart == inEnd) {
            return root;
        }
        
        int inIndex = search(inorder, inStart, inEnd, root.data);
        
        root.left = buildTreeUtil(inorder, preorder, inStart, inIndex - 1);
        root.right = buildTreeUtil(inorder, preorder, inIndex + 1, inEnd);
        
        return root;
    }
    
    private static int search(int[] arr, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}