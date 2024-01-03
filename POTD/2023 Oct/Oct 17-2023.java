//Transitive closure of a Graph

class Solution {
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][]) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i=0;
        while(i<N){
            int j=0;
            ArrayList<Integer> temp=new ArrayList<>();
            while(j<N){
                if(graph[i][j]==1 || i==j) temp.add(1);
                else temp.add(0);
                j++;
            }
            result.add(temp);
            i++;
        }
        int k=0;
        while(k<N){
            int p=0;
            while(p<N){
                int q=0;
                while(q<N){
                    if(result.get(p).get(q)==1 || (result.get(p).get(k)==1 && result.get(k).get(q)==1))result.get(p).set(q, 1);
                    q++;
                }
                p++;
            }
            k++;
        }
        return result;
    }
}