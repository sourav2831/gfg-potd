//Insert a node in a BST

class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        if(root==null){
            Node newNode=new Node(key);
            return newNode;
        }
        if(root.data==key)return root;
        if(root.data<key){
            root.right=insert(root.right,key);
        }
        else {
            root.left=insert(root.left,key);
        }
        return root;
    }
}