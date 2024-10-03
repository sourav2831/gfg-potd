class Solution {
    public List<Integer> findMajority(List<Integer> nums) {
        List<Integer> ans = new ArrayList<>();
        int mVotes = nums.size()/3;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key)>mVotes){
                ans.add(key);
            }
        }
        if(ans.size() == 0){
            ans.add(-1);
        }
        Collections.sort(ans);
        return ans;
    }
}