//Check if string is rotated by two places

class Solution {
    public static boolean isRotated(String str1, String str2) {
        int flag = 0, n = str1.length(), m = str2.length();
        for(int i = 0; i < n; i++)  
            if(str1.charAt((i + 2) % n) != str2.charAt(i))
                flag = 1;
        if(flag == 1) {
            for(int i = 0; i < n; i++)  
                if(str1.charAt(i) != str2.charAt((i + 2) % m))
                    return false;
        }
        return true;
    }
}