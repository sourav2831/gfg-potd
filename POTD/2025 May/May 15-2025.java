class Solution {
    public int countSubstring(String s) {
        // code here
         int subString = 0;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i) - 97;
            subString += 1 + freq[j];
            freq[j]++;
        }
        return subString;
    }
}