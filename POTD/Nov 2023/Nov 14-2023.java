//Check if strings are rotations of each other or not

class Solution {
    public static boolean areRotations(String s1, String s2){
        if(s2.length()!=s1.length())return false;
        String n=s1+s1;
        if(n.indexOf(s2)!=-1)return true;
        return false;
    }
}