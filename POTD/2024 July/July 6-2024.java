class Solution {
    public Node prev;
    public void populateNext(Node root) {
        if(root==null) return;
        prev = null;
        traversal(root);
    }
    public void traversal(Node root){
        if(root==null) return;
        
        traversal(root.right);
        root.next = prev;
        prev = root;
        traversal(root.left);
    }
}