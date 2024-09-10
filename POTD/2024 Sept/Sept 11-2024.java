class Solution {
    long minCost(long arr[]) {
        int n = arr.length;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        int i=0;
        while(i<n){
            pq.add(arr[i]);
            i++;
        }
        long ans=0;
        while(pq.size()>1){
            long first=pq.remove();
            long second=pq.remove();
            ans+=(first+second);
            pq.add(first+second);
        }
        return ans;
    }
}