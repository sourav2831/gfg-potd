//Detect Cycle using DSU

class Solution {
    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj){
        if(V == 2) return 0;
        HashSet<String> h=new HashSet<>();
        Disjoint d = new Disjoint(V);
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int v = adj.get(i).get(j);
                int u=i;
                if (d.fup(u) == d.fup(v) && h.contains(fun(u,v))==false) {
                    return 1;
                } else {
                    d.union(u, v);
                    h.add(fun(u,v));
                    h.add(fun(v,u));
                }
            }
        }
        return 0;
    }
    
    static String fun(int u,int v) {
        String ans=Integer.toString(u);
        ans+=Integer.toString(v);
        return ans;
    }
}
class Disjoint {
    int[] sz;
    int[] pr;
    Disjoint(int n) {
        pr=new int[n+1];
        sz=new int[n+1];
        for(int i=0;i<=n;i++){
            pr[i]=i;
            sz[i]=1;
        }
    }
    int fup(int node){
        if(node==pr[node])return node;
        return pr[node]=fup(pr[node]);
    }
    void union(int u,int v){
        int up=fup(u);
        int vp=fup(v);
        if(u==v) return;
        if(sz[up]>sz[vp]){
            sz[up]=sz[up]+sz[vp];
            pr[vp]=pr[up];
        }
        else{
            sz[vp]=sz[up]+sz[vp];
            pr[up]=pr[vp];
        }
    }
}