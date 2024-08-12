class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length+arr2.length];
        int ans=0, middle=merge.length/2;
        System.arraycopy(arr1,0,merge,0,arr1.length);
        System.arraycopy(arr2,0,merge,arr1.length,arr2.length);
        Arrays.sort(merge);
        return merge[middle-1]+merge[middle];
    }
}