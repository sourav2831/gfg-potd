//Check for Balanced Tree

class Tree {
    boolean isBalanced(Node root) {
        return isBalancedUtil(root)==-1?false:true;
    }
    int isBalancedUtil(Node root){
        if(root==null)return 0;
        int smallAnsLeft=isBalancedUtil(root.left);
        int smallAnsRight=isBalancedUtil(root.right);
        if(smallAnsRight==-1)return -1;
        if(smallAnsLeft==-1)return -1;
        if(Math.abs(smallAnsLeft-smallAnsRight)>1)return -1;
        return Math.max(smallAnsLeft,smallAnsRight)+1;
    }
}