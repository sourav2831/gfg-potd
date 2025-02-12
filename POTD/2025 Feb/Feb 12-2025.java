class Solution {
    // Return the Kth smallest element in the given BST
 ArrayList<Integer> lst=new ArrayList<>();
    public int kthSmallest(Node root, int k) {
        // Write your code here
        inorder(root);
        if(k>lst.size()){
            return -1;
        }
        return lst.get(k-1);
    }
    
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        lst.add(root.data);
        inorder(root.right);
    }
}