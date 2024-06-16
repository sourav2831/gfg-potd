//Prime Pair with Target Sum

class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        boolean isPrime[]=new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=2;i<n;i++){
            if(isPrime[i]==true){
                temp.add(i);
            }
        }
        int a=-1;
        int b=-1;
        int low=0;
        int high=temp.size()-1;
        while(low<=high){
            int sum=temp.get(low)+temp.get(high);
            if(sum==n){
                a=temp.get(low);
                b=temp.get(high);
                break;
            }
            else if(sum<n){
                low++;
            }
            else{
                high--;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(a==-1 || b==-1){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        ans.add(a);
        ans.add(b);
        return ans;
    }
}