class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> l=new ArrayList<>();
        int n=arr.length;
        int i=0;
        int j=arr.length-1;
        while(i < j){
            l.add(arr[j]);
            l.add(arr[i]);
            i++;
            j--;
        }
        if(n% 2 != 0)  l.add(arr[n/2]);
        return l;
    }
}
