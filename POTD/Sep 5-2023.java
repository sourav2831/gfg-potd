//Print adjacency list

class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> list=new ArrayList<>();
        while(list.size()<V){
              list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
           int u=edges[i][0];
           int v=edges[i][1];
           list.get(v).add(u);
           list.get(u).add(v);
        }
        return list;
    }
}