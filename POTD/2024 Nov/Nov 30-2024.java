class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length())return false;
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[((int)s1.charAt(i))-'a']++;
            arr[((int)s2.charAt(i))-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}