//Check whether BST contains Dead End

class Solution {
    public static boolean isDeadEnd(Node root) {
        return isDeadEndUtil(root,0,Integer.MAX_VALUE);
    }
    public static boolean isDeadEndUtil(Node root, int min, int max){
        if(root==null)return false;
        if(root.data-1==min && root.data+1==max){
            return true;
        }
        return isDeadEndUtil(root.left,min,root.data)||isDeadEndUtil(root.right,root.data,max);
    }
}