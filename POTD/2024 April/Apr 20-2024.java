//Union of Two Sorted Arrays 
 
class Solution {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> res=new ArrayList<>();
        TreeSet<Integer> set=new TreeSet<>();
        for(int a:arr1)  set.add(a);
        for(int b:arr2) set.add(b);
        for(int c:set) res.add(c);
        return res;
    }
}