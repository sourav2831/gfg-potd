//Gray to Binary equivalent

class Solution{
    public static int grayToBinary(int n) {
        String gray = Integer.toBinaryString(n);
        String ans = ""+gray.charAt(0);
        for(int i=1;i<gray.length();i++){
            int x = (int)(ans.charAt(ans.length()-1))^(int)(gray.charAt(i));
            ans += Integer.toString(x);
        }
        return Integer.parseInt(ans,2);
    }
}