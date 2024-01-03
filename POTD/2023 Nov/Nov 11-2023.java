//Isomorphic Strings

class Solution{
    public static boolean areIsomorphic(String str1,String str2) {
        char map1[]=new char[256];
        char map2[]=new char[256];
        if(str1.length()!=str2.length()) return false;
        char defaultValue=map1[0];
        for(int i=0;i<str1.length();i++){
            if(map1[str1.charAt(i)]!=defaultValue && map1[str1.charAt(i)]!=str2.charAt(i))return false;
            else if(map1[str1.charAt(i)]==defaultValue )map1[str1.charAt(i)]=str2.charAt(i);
            if(map2[str2.charAt(i)]!=defaultValue && map2[str2.charAt(i)]!=str1.charAt(i))return false;
            else if(map2[str2.charAt(i)]==defaultValue)map2[str2.charAt(i)]=str1.charAt(i);
        }
        return true;
    }
}