//Min distance between two given nodes of a Binary Tree

class GfG {
    int findDist(Node root, int a, int b) {
        Node lca=getLca(root,a,b);
        int dist1=getDist(lca,a,0);
        int dist2=getDist(lca,b,0);
        return dist1+dist2;
    }
    Node getLca(Node root, int n1,int n2)
	{
		if(root==null)return root;
		if(root.data==n1||root.data==n2){
		    return root;
		}
		Node left=getLca(root.left,n1,n2);
		Node right=getLca(root.right,n1,n2);
		if(left!=null && right!=null)return root;
		if(right!=null)return right;
		return left;
	}
	int getDist(Node root,int a,int level){
	    if(root==null)return -1;
	    if(root.data==a)return level;
	    int left=getDist(root.left,a,level+1);
	    int right=getDist(root.right,a,level+1);
	    return left!=-1?left:right;
	}
}