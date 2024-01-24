//Check if a given graph is tree or not

class Solution {
    public boolean isTree(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        if(v==1 && e==0)return true;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<v;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            map.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            map.get(edges.get(i).get(1)).add(edges.get(i).get(0));//undirected
        }
        boolean visited[] = new boolean[v];
        boolean cycle = false;
        for(int i=0;i<v;i++){
            if(!visited[i] && isCycle(map,visited,v,i)){
                cycle = true;
                break;
            }
        }
        if(cycle==true)return false;
        boolean notConnected = false;
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                notConnected = true;
                break;
            }
        }
        if(notConnected==true)return false;
        return true;
    }
    public static boolean isCycle(HashMap<Integer,ArrayList<Integer>> map,boolean visited[], int v,int curr){
        int parent[] = new int[v];
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(parent,-1);
        q.add(curr);
        visited[curr] = true;
        if(map.get(curr).isEmpty())return true;
        while(!q.isEmpty()){
            int u = q.poll();
            for(Integer it : map.get(u)){
                if(!visited[it]){
                    q.add(it);
                    visited[it] = true;
                    parent[it] = u;
                }else if(parent[u]!=it){
                    return true;
                }
            }
        }
        return false;
    }
}