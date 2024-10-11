class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        int temp= -1;
        int n = arr.size();
        for(int i=0; i<n; i++){
        	if(arr.get(i) != -1 ){
        	    int j = arr.get(i);
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
        	}
        }
        return arr;
    }
}