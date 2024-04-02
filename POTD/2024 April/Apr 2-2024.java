//Minimum Absolute Difference In BST

class Solution {
    int min,prev;
    int absolute_diff(Node root){
        prev=-1;
        min=Integer.MAX_VALUE;
        inorder(root);
        return min;
    }
    void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        if(prev==-1)prev=root.data;
        else {
            min=Math.min(min,root.data-prev);
            prev=root.data;
        }
        inorder(root.right);
    }
}