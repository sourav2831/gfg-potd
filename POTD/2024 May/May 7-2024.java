//Reverse Level Order Traversal

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr=q.remove();
            ans.add(curr.data);
            if(curr.right!=null)q.add(curr.right);
            if(curr.left!=null)q.add(curr.left);
        }
        Collections.reverse(ans);
        return ans;
    }
}      