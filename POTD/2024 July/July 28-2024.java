class Solution {
    String removeDups(String str) {
       HashSet<Character> set = new HashSet<>();
        String s1="";
        for (int i = 0; i < str.length(); i++) {
               if(set.add(str.charAt(i))) s1=s1+str.charAt(i);
        }
            return s1;
    }
}