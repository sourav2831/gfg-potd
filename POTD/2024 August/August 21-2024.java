class Pair{
    int v;
    int dist;
    Pair(int _v, int _dist){
        v=_v;
        dist=_dist;
    }
}
class Solution {
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        HashMap<Integer,ArrayList<Integer>> adj=makeGraph(edges,n,m);
        int ans[]=new int[n];
        Queue<Pair> q=new LinkedList<>();
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src]=0;
        q.add(new Pair(src,0));
        while(!q.isEmpty()){
            Pair curr=q.remove();
            for(int v:adj.get(curr.v)){
                if(ans[v]>curr.dist+1){
                    ans[v]=curr.dist+1;
                    q.add(new Pair(v,ans[v]));
                }
            }
        }
        int i=0;
        while(i<n){
            if(ans[i]==Integer.MAX_VALUE){
                ans[i]=-1;
            }
            i++;
        }
        return ans;
    }
    public HashMap<Integer,ArrayList<Integer>> makeGraph(int[][] edges, int n, int m){
        HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
        int i=0;
        while(i<n){
            adj.put(i,new ArrayList<>());
            i++;
        }
        i=0;
        while(i<m){
            ArrayList<Integer> temp1=adj.get(edges[i][0]);
            temp1.add(edges[i][1]);
            ArrayList<Integer> temp2=adj.get(edges[i][1]);
            temp2.add(edges[i][0]);
            adj.put(edges[i][0],temp1);
            adj.put(edges[i][1],temp2);
            i++;
        }
        return adj;
    }
}