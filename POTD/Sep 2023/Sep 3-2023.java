//Check if Tree is Isomorphic

class Solution{ 
    boolean isIsomorphic(Node root1, Node root2){ 
         if(root1==null && root2==null)return true;
         if(root1==null || root2==null)return false;
         if(root1.data!=root2.data)return false;
         boolean ans1=isIsomorphic(root1.left,root2.right);
         boolean ans2=isIsomorphic(root1.right,root2.left);
         if(ans1&&ans2)return true;
         boolean ans3=isIsomorphic(root1.left,root2.left);
         boolean ans4=isIsomorphic(root1.right,root2.right);
         return (ans3&&ans4);
    }
} 