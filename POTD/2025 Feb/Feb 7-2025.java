class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inOrderUtil(root,ans);
        return ans;
    }
    void inOrderUtil(Node root, ArrayList<Integer> ans){
        if(root==null)return;
        inOrderUtil(root.left,ans);
        ans.add(root.data);
        inOrderUtil(root.right,ans);
    }
}