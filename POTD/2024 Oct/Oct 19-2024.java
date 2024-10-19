class Solution {
    String roundToNearest(String s) {
        int n = s.length();
        if (s.charAt(n - 1) <= '5') return s.substring(0, n - 1)+"0";
        StringBuilder str = new StringBuilder(s);
        str.setCharAt(n - 1, '0');
        int i = n - 2;
        while (i >= 0 && str.charAt(i) == '9') {
            str.setCharAt(i, '0');
            --i;
        }
        if (i < 0) str.insert(0, '1');
        else str.setCharAt(i, (char) (s.charAt(i)+ 1));
        return str.toString();
    }
}