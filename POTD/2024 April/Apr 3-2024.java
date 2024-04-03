//Kth common ancestor in BST

class Solution {
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        if(root==null)return -1;
        Node lca = LCA(root,x,y);
        HashMap<Node,Node> map = new HashMap<>();
        map.put(root,null);
        getParent(root,map);
        while(--k>0){
            lca = map.get(lca);
            if(lca==null)return -1;
        }
        return lca.data;
    }
    Node LCA(Node root,int x,int y){
        if(root==null)return null;
        if(x<root.data && y<root.data)return LCA(root.left,x,y);
        else if(x>root.data && y>root.data)return LCA(root.right,x,y);
        return root;
    }
    void getParent(Node root, HashMap<Node,Node> map){
        if(root==null)return;
        if(root.left!=null){
            map.put(root.left,root);
            getParent(root.left,map);
        }
        if(root.right!=null){
            map.put(root.right,root);
            getParent(root.right,map);
        }
    }
}