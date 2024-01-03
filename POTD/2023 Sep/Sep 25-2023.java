//Maximum Sum Combination

class Triplet{
    int first;
    int second;
    int ind;
    Triplet(int _first, int _second, int _ind){
        first=_first;
        second=_second;
        ind=_ind;
    }
}

class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        Integer arr[]=new Integer[N];
        Integer brr[]=new Integer[N];
        for(int i=0;i<N;i++){
            arr[i]=A[i];
            brr[i]=B[i];
        }
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(brr,Collections.reverseOrder());
        PriorityQueue<Triplet> pq=new PriorityQueue<>((a,b)->(b.first+b.second)-(a.first+a.second));
        List<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<N && i<K){
            pq.add(new Triplet(arr[i],brr[0],0));
            i++;
        }
        i=0;
        while(!pq.isEmpty() && i<K){
            Triplet curr=pq.remove();
            ans.add(curr.first+curr.second);
            i++;
            if(curr.ind+1==N)continue;
            pq.add(new Triplet(curr.first,brr[curr.ind+1],curr.ind+1));
        }
        return ans;
    }
}
