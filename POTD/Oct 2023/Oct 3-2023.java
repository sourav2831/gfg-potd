//Column name from a given column number

class Solution {
    String colName (long n) {
        String ans = "";
        if (n <= 26) ans = Character.toString((char)(64+n));
        else{
            StringBuilder str = new StringBuilder();
            while (n > 0){
                n--;
                char ch = (char)('A' + n%26);
                str.insert(0,ch);
                n/=26;
            }
            ans = str.toString();
        }
        return ans;
    }
}