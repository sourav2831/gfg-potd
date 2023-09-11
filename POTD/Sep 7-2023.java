//Minimum Multiplications to reach End

class pair{
    int n;
    int s;
    pair(int a,int b){
        n=a;
        s=b;
    }
}
class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        if(start==end)return 0;
        int mod=100000;
        Queue <pair> q=new LinkedList<>();
        q.add(new pair(start,0));
        int[] dist=new int[100000];
        Arrays.fill(dist,(int)1e9);
        dist[start]=0;
        while(!q.isEmpty()){
            pair t=q.poll();
            int n=t.n;
            int s=t.s;
            for(int i:arr){
                 int nd=(i*n)%mod;
                if(s+1<dist[nd]){
                dist[nd]=s+1;
                if(nd==end) return s+1;
                q.add(new pair(nd,s+1));
                } 
                
            }
        }
        return -1;
    }
}