//Water the plants

class Solution{
    class Pair{
        int val, left, right;
        Pair(int val, int left, int right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int min_sprinklers(int gallery[], int n){
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(gallery[i] >= 0 ) {
                int val = gallery[i];
                int left = (i-val >= 0) ? i-val : 0;
                int right = (i+val < n) ? i+val : n-1;
                arr.add(new Pair(val, left, right));
            }
        }
        Collections.sort(arr, (a, b)->{
            return a.left-b.left;
        });
        int start = -1;
        int end = -1;
        int idx = 0;
        int cnt = 0;
        while(end < n-1 && idx < n) {
            Pair p = arr.get(idx);
            if(p.left <= start+1) {
                end = Math.max(end, p.right);
            }else if(p.left > end+1) {
                return -1;
            }else {
                start = end;
                end = p.right;
                cnt++;
            }
            idx++;
        }
        return cnt+1;
    }
}