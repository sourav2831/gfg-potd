//Count More than n/k Occurences

class Solution {
    public int countOccurence(int[] arr, int n, int k) {   
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]))map.put(arr[i], map.get(arr[i])+1);
            else map.put(arr[i], 1);
        }
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]) && map.get(arr[i]) > (n/k)){
                count++;
                map.remove(arr[i]);
            }
        }
        return count;
    }
}