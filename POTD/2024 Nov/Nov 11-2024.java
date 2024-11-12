class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Queue<Entry> queue = new PriorityQueue<>((e1,e2)->e1.key-e2.key);
        Map<Integer, Entry> map = new HashMap<>();
        for(int a:arr){
            Entry existing = map.getOrDefault(a, new Entry(a, 0));
            existing.count++;
            map.put(a, existing);
        }
        for(Map.Entry<Integer,Entry> entries:map.entrySet()){
            queue.add(entries.getValue());
        }
        int moves=0;
        while(!queue.isEmpty()){
            Entry entry = queue.poll();
            if(entry.count>1){
                moves += entry.count-1;
                int next = entry.key+1;
                Entry nextEntry = map.getOrDefault(next,new Entry(next, 0));
                nextEntry.count += entry.count-1;
                if(!map.containsKey(next)){
                    queue.add(nextEntry);
                }
            }
        }
        return moves;
    }
    class Entry{
        int key;
        int count;
        Entry(int key, int count){
            this.key =key;
            this.count=count;
        }
        public String toString(){
            return this.key+" > "+this.count;
        }
    }
}