class Tree
{
    public static void printCorner(Node node)
    {
        if(node==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int size=q.size();
            int i=0;
            while(i<size){
                Node curr=q.remove();
                if(i==0 || i==size-1){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                i++;
            }
        }
    }
}