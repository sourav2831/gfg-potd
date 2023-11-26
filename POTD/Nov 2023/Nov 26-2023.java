//print pattern

class Solution{
    public List<Integer> pattern(int N){
        List<Integer> ans = new ArrayList<>();
        ans.add(N);
        if(N == 0) return ans;
        int temp = N;
        positive(temp,ans,N);
        return ans;
    }
    void positive (int val, List<Integer> ans,int N){
        if(val>0){
            ans.add(val-5);
            val=val-5;
            positive(val,ans,N);
        }
        else negative(val,ans,N);
    }
    void negative(int val, List<Integer> ans,int N){
        if(val<N){
            ans.add(val+5);
            val = val+5;
            negative(val,ans,N);
        }
        return;
    }
}