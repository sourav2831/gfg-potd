//Brothers From Different Roots

class Solution
{
    static HashSet<Integer> set;
    static int count;
	public static int countPairs(Node root1, Node root2, int x)
	{
	    set=new HashSet<>();
		inorder(root1);
		count=0;
		getCount(root2,x);
		return count;
	}
	public static void inorder(Node root){
	    if(root==null)return;
	    inorder(root.left);
	    set.add(root.data);
	    inorder(root.right);
	}
	public static void getCount(Node root, int x){
	    if(root==null)return;
	    if(set.contains(x-root.data))count++;
	    getCount(root.left,x);
	    getCount(root.right,x);
	}
}