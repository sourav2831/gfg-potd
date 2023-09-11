//Binary Tree to BST

class Solution
{
    Node binaryTreeToBST(Node root)
    {
       ArrayList<Integer> temp=new ArrayList<>();
       inorder(root,temp);
       Collections.sort(temp);
       return buildTree(temp,0,temp.size()-1);
    }
    void inorder(Node root,ArrayList<Integer> temp){
        if(root==null)return;
        inorder(root.left,temp);
        temp.add(root.data);
        inorder(root.right,temp);
    }
    Node buildTree(ArrayList<Integer> temp,int i,int j){
        if(i>j)return null;
        int mid=i-(i-j)/2;
        Node root=new Node(temp.get(mid));
        if(i==j)return root;
        root.left=buildTree(temp,i,mid-1);
        root.right=buildTree(temp,mid+1,j);
        return root;
    }
}