class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
       ArrayList<ArrayList<Integer>> li = new ArrayList<>();
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty())
       {
           int s= q.size();
            ArrayList<Integer> ans = new ArrayList<>();
           for(int i=0;i<s;i++)
           {
               Node res= q.poll();
               ans.add(res.data);
               
               if(res.left!=null)
               {
                   q.add(res.left);
               }
               if(res.right!=null)
               {
                   q.add(res.right);
               }
               
               
           }
           li.add(ans);
       }
       return li;
    }
}