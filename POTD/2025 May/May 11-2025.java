class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum +=arr[j];
                list.add(sum);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        return list.get(k-1);
    }
}