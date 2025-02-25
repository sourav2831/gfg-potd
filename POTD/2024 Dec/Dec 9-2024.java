class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]>  ans = new ArrayList<>();
        
         PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)-> a[0]-b[0]); 
         
         
         for(int[] interval : intervals){
             pq.offer(interval);
            }
         pq.offer(newInterval);
         
         int[] curr= pq.poll();
         
         while(!pq.isEmpty()){
             
             int [] next =pq.poll();
             
             if(curr[1]>=next[0]){
                 curr[1] =Math.max(curr[1],next[1]);
             }
             else{
                 ans.add(curr);
                 curr= next;
             }
         }
         
         ans.add(curr);
         return ans ;
     } 
}