//Symmetric Tree

class GfG {
    public static boolean isSymmetric(Node root){
        if(root == null)return true;
        return isMirror(root.left,root.right);
    }
    public static boolean isMirror(Node node1,Node node2){
       if(node1 == null && node2 == null)return true;
       if(node1 == null || node2 == null )return false;
       if(node1.data != node2.data)return false;
       return isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left);
   }
}