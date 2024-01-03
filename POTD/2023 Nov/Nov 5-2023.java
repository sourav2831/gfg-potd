//Top K Frequent Elements in Array

class Solution {
    public int[] topK(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
         PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
           if(hm.get(a)-hm.get(b)==0)return b-a;
           else return hm.get(b)-hm.get(a);
        });
        int ans[]=new int[k];
        for(int i:hm.keySet())pq.add(i);
        int i=0;
        while(!pq.isEmpty() && i<k)ans[i++]=pq.poll();
        return ans;
    }
}