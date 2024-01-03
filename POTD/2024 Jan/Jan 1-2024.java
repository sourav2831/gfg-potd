//Array Pair Sum Divisibility Problem

class Solution {
    public boolean canPair(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int size=nums.length;
        if(size%2!=0)return false;
        int i=0;
        while(i<size){
            nums[i]=nums[i]%k;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            i++;
        }
        i=0;
        if(map.containsKey(0)&&map.get(0)%2!=0)return false;
        while(i<size){
            if(nums[i]==0){
                i++;
                continue;
            }
            if((map.get(nums[i]) != map.get(k-nums[i])))return false;
            i++;
        }
        return true;
    }
}