class Solution {
    public List<int> countLessEq(int[] a, int[] b) {
        Array.Sort(b);
        int [] ans = new int[a.Length];
        for (int i = 0; i < a.Length; i++) {
            ans[i] = UpperBound(b, a[i]);
        }
        return ans.ToList();
    }
    
    int UpperBound(int[] nums, int target) {
        //search space [lo, hi), lo included , hi excluded
        int lo = 0, hi = nums.Length;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                hi = mid;
            } else  {
                lo = mid;
            }
        }
        return (nums[lo] > target) ? lo : lo + 1;
    }
}