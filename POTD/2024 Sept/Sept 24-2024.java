class Solution {
    public static String smallestWindow(String s, String p){
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        int haveCount = 0, needCount = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0, endIndex = 0;
        int i = 0, j = 0;
        int n = s.length();
        
        if(s.length() < p.length()) return "-1";
        
        while (i < p.length()) {
            int val = need.getOrDefault(p.charAt(i), 0) + 1;
            need.put(p.charAt(i), val);
            i++;
        }
        needCount = need.size();
        i = 0;
        while (j < n) {
            if (haveCount < needCount) {
                char ch = s.charAt(j);
                if (need.containsKey(ch)) {
                    int val = have.getOrDefault(ch, 0) + 1;
                    have.put(ch, val);

                    if (val == need.get(ch)) haveCount++;
                }
                j++;
            }
            else {
                if (j - i < minLength) {
                    startIndex = i;
                    endIndex = j - 1;
                    minLength = j - i;
                }
                char ch = s.charAt(i);
                if (have.containsKey(ch)) {
                    int val = have.get(ch) - 1;
                    have.put(ch, val);
                    if (val < need.get(ch)) haveCount--;
                }
                i++;
            }
        }
        while ((haveCount == needCount)) {
            if (j - i < minLength) {
                startIndex = i;
                endIndex = j - 1;
                minLength = j - i + 1;
            }
            char ch = s.charAt(i);
            if (have.containsKey(ch)) {
                int val = have.get(ch) - 1;
                have.put(ch, val);
                if (val < need.get(ch)) haveCount--;
            }
            i++;
        }
        if (minLength == Integer.MAX_VALUE) return "-1";
        return s.substring(startIndex, endIndex + 1);
    }
}