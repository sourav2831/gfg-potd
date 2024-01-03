//Binary Tree to CDLL

class Solution { 
    Node prev = null;
    Node bTreeToClist(Node root){
        if(root == null)return root;
        Node head = bTreeToClist(root.left);
        if(prev == null)head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        bTreeToClist(root.right);
        if (head != null && prev != null) {
            head.left = prev;
            prev.right = head;
        }
        return head;
    }
}
    