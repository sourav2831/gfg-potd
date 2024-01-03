//Wildcard string matching

class Solution{
    static boolean match(String wild, String pattern){
        return matchUtil(wild,pattern,wild.length()-1,pattern.length()-1);
    }
    static boolean matchUtil(String wild, String pattern, int w, int p){
        if(w<0 && p<0)return true;
        if(w<0 && p>=0)return false;
        if(w>=0 && p<0){
            int i=0;
            while(i<=w){
                if(wild.charAt(i)!='*')return false;
                i++;
            }
            return true;
        }
        if(wild.charAt(w)==pattern.charAt(p)||wild.charAt(w)=='?'){
            return matchUtil(wild,pattern,w-1,p-1);
        }else if(wild.charAt(w)=='*'){
            return matchUtil(wild,pattern,w,p-1)||matchUtil(wild,pattern,w-1,p);
        }
        return false;
    }
}