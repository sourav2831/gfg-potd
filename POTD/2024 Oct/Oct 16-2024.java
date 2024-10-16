class Solution {
    public boolean checkSorted(List<Integer> arr) {
        int count = 0;
        for(int i = 0 ; i < arr.size() && count<2 ; i++){
            if(arr.get(i)!=i+1){
                count++;
                int temp = arr.get(i);
                arr.set(i,arr.get(temp-1));
                arr.set(temp-1,temp);
            }
        }
        if(count==1) return false;
        for(int i = 0 ; i < arr.size()-1 ; i++){
            if(arr.get(i)>arr.get(i+1)) return false;
        }
        return true;
    }
}