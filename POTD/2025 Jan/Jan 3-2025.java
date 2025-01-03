class Solution {
    public long subarrayXor(int[] arr, int k) {
        Map<Integer, Integer> prefixXorCount = new HashMap<>();
        prefixXorCount.put(0, 1);
        long count = 0;
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
            int target = xor ^ k;
            count += prefixXorCount.getOrDefault(target, 0);
            prefixXorCount.put(xor, prefixXorCount.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}