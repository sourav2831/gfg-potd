//Reverse First K elements of Queue

class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k){
      int a[]=new int[k];
      for(int i=0;i<k;i++){
          a[i]=q.remove();
        }
        for(int i=k-1;i>=0;i--){
          q.add(a[i]);
        }
            for(int i=0;i<q.size()-k;i++){
          q.add(q.remove());
        }
        return q;
    }
}