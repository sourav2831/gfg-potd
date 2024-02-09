//Check for Children Sum Property in a Binary Tree

class Solution{
    public static int isSumProperty(Node root){
        if(root==null)return 1;
        if(root.left==null && root.right==null)return 1;
        int r;
        int l;
        if(isSumProperty(root.left)==1&&isSumProperty(root.right)==1){
            if(root.left==null)l=0;
            else l=root.left.data;
            if(root.right==null)r=0;
            else r=root.right.data;
            return (l+r==root.data)?1:0;
        }
        return 0;
    }
}