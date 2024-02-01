//Panagram Checking

class Solution {
    public static boolean checkPangram  (String s) {
        Set<Character> hs = new HashSet<>();
        s=s.toUpperCase();
        for(char c : s.toCharArray()){
            if((c >= 'A' && c<='Z'))hs.add(c);
        }
        if(hs.size()==26) return true;
        return false;
    }
}