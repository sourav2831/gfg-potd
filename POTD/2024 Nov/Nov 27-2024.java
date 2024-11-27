class Solution {
    public int missingNumber(int[] arr) {
        int smallest = 1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
             hs.add(arr[i]);
        }
        int k = 0;
        while(k<arr.length){
            if(hs.contains(smallest)){
                smallest++;
                  k++;
            }
            else break;
        }
        return smallest;
    }
}
