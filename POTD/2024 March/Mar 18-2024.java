//Level order traversal

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr=q.remove();
            ans.add(curr.data);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
        return ans;
    }
}
