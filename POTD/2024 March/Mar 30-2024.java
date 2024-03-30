//Minimum element in BST

class Solution {
    int minValue(Node root) {
        if(root==null)
        {
            return -1;
        }
        Node node = root ;
        while(node.left!=null)
        {
            node=node.left;
        }
        return node.data;
    }
}
