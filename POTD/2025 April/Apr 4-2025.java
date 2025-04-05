class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        int n = V;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Fill the adjacency list with the edges
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean [] visit = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visit[i]){
                if(bfs(i,adj,visit,-1)) return true; 
            }
        }
        return false;
    }
    
    public boolean bfs(int s,ArrayList<ArrayList<Integer>> adj,boolean [] visit,int parent){
        visit[s] = true;
        for(int elem:adj.get(s)){
            if(!visit[elem]){
                if(bfs(elem,adj,visit,s)) return true;
            }
            else if(elem!=parent) return true;
        }
        return false;
    }
}