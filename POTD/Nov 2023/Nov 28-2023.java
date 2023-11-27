//Sum of dependencies in a graph

class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int r = 0;
        for(int i = 0; i < V; i++) r = r + adj.get(i).size();
        return r;
    }
}