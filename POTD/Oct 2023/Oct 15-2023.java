//Normal BST to Balanced BST

class GfG {
    Node buildBalancedTree(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        inOrder(root,ans);
        Node temp=bst(ans,0,ans.size()-1);
        return temp;
    }
    void inOrder(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        inOrder(root.left,ans);
        ans.add(root.data);
        inOrder(root.right,ans);
    }
    Node bst(ArrayList<Integer> ans,int start,int end){
        Node root=null;
        if(start<=end){
            int mid=start+(end-start)/2;
            root=new Node(ans.get(mid));
            root.left=bst(ans,start,mid-1);
            root.right=bst(ans,mid+1,end);
        }
        return root;
    }
}