class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, 0));
        for (int num : arr)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1;i>=0;i--)
        {
            while (!st.isEmpty() && freq.get(st.peek()) <= freq.get(arr[i]))
            {
                st.pop();
            }
            
            if(st.empty())
            {
                ans.set(i, -1);
            }
            else{
                ans.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        
        return ans;
    }
}