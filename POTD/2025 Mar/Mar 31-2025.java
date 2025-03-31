class Solution {
    public int maxPartitions(String s) {
        int idx[] = new int[26];
        for(int i=0;i<s.length();i++) {
            idx[s.charAt(i)-'a'] = i;
        }
        
        int cnt = 0;
        int last = 0;
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            last = Math.max(last, idx[ch - 'a']);
            if(last == i){
                cnt++;
            }
        }
        return cnt;
    }
}