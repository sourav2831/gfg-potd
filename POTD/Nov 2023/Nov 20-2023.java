//K Sum Paths

class Solution
{
    int ans;
    public int sumK(Node root,int k)
    {
        ans=0;
        ArrayList<Integer> path=new ArrayList<>();
        sumKUtil(root,k,path);
        return ans;
    }
    public void sumKUtil(Node root,int k,ArrayList<Integer> path){
        if(root==null)return;
        path.add(root.data);
        int sum=0;
        int i=path.size()-1;
        while(i>=0){
            sum+=path.get(i);
            if(sum==k)ans++;
            i--;
        }
        sumKUtil(root.left,k,path);
        sumKUtil(root.right,k,path);
        path.remove(path.size()-1);
    }
}