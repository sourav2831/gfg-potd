class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        return helper(root, root, target);
    }
    
    boolean helper(Node root, Node current, int target){
        if(root == null || current == null){
            return false;
        }
        if(findNode(root,current,target-current.data)){
            return true;
        }
        return helper(root, current.left, target) 
        || helper(root, current.right, target);
    }
    
    boolean findNode(Node root, Node current, int target){
        if(root == null || root == current){
            return false;
        }
        if(root.data == target){
            return true;
        }
        else if(root.data > target){
            return findNode(root.left, current, target);
        } 
        else {
            return findNode(root.right,current, target);
        }
    }
}