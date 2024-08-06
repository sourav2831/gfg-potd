class Solution {
    public boolean isValid(String str) {
        String[] arr = str.split("\\.");
        if (arr.length != 4) return false;
        for (String s : arr) {
            if (s.length() == 0 || (s.length() > 1 && s.charAt(0) == '0')) return false;
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) return false;
            }
            try {
                int val = Integer.parseInt(s);
                if (val < 0 || val > 255) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}