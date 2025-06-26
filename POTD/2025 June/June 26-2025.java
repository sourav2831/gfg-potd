class Solution {
    public int minValue(String s, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : freqMap.values()) {
            maxHeap.add(freq);
        }
        while (k > 0 && !maxHeap.isEmpty()) {
            int top = maxHeap.poll();
            if (top > 1) {
                maxHeap.add(top - 1);
            }
            k--;
        }
        int sum = 0;
        while (!maxHeap.isEmpty()) {
            int freq = maxHeap.poll();
            sum += freq * freq;
        }

        return sum;
    }
}