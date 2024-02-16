//Flatten BST to sorted list

class Solution {
    public void inorder(Node root,ArrayList<Integer> l1){
        if(root==null){
            return;
        }
        inorder(root.left,l1);
        l1.add(root.data);
        inorder(root.right,l1);
    }
    public Node flattenBST(Node root) {
        // Code here
        ArrayList<Integer> l1=new ArrayList<Integer>();
        inorder(root,l1);
        
        int count=1;
          Node x=new Node(l1.get(0));
          Node prev=x;
        while(count<l1.size()){
            Node y=new Node(l1.get(count));
            prev.right=y;
            prev=y;
            count++;
        }
        return x;
    }
}