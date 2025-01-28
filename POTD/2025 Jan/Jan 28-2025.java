class Solution {
    
    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void helper(char[] arr, int idx, HashSet<String> set){
        if(idx == arr.length){
            set.add(new String(arr));
            return;
        }
        for(int i = idx; i < arr.length; i++){
            swap(arr, i, idx);
            helper(arr, idx + 1, set);
            swap(arr, i, idx);
        }
    }
    
    public ArrayList<String> findPermutation(String s) {
        // Code here
        HashSet<String> set = new HashSet<>();
        helper(s.toCharArray(), 0, set);
        return new ArrayList<>(set);
    }
}