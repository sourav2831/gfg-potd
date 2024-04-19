//Find missing in second array

class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(b[i],map.getOrDefault(b[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(a[i]) == null)ans.add(a[i]);
        }
        return ans;
    }
}