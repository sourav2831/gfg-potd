//Odd Even Problem

class Solution {
    public static String oddEven(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int x = 0, y = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                if ((i + 1) % 2 == 0 && freq[i] % 2 == 0) {
                    x++;
                }
                if ((i + 1) % 2 != 0 && freq[i] % 2 != 0) {
                    y++;
                }
            }
        }

        return (x + y) % 2 == 0 ? "EVEN" : "ODD";
    }
}