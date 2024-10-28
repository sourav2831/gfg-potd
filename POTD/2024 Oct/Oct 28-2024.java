class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int x : arr)
            map.put(x, true); 
        for (int x : arr)
            if (map.get(x)) {
                ans.add(x);
                map.replace(x, false);
            }
        return ans;
    }
}
