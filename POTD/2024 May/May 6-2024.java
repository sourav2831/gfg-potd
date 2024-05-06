//Print all nodes that don't have sibling

class Tree {
    ArrayList<Integer> noSibling(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        noSiblingUtil(node,ans);
        if(ans.size()==0)ans.add(-1);
        Collections.sort(ans);
        return ans;
    }
    void noSiblingUtil(Node root, ArrayList<Integer> ans){
        if(root==null)return;
        if(root.left==null && root.right==null)return;
        if(root.left!=null && root.right==null){
            ans.add(root.left.data);
            noSiblingUtil(root.left,ans);
            return;
        }else if(root.left==null && root.right!=null){
            ans.add(root.right.data);
            noSiblingUtil(root.right,ans);
            return;
        }
        noSiblingUtil(root.right,ans);
        noSiblingUtil(root.left,ans);
    }
}