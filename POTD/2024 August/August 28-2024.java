class Solution {
    public ArrayList<Integer> sortByFreq(int arr1[]) {
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int val:arr1){
                map.put(val,map.getOrDefault(val,0)+1);
            }
            int size=map.size();
            int arr[][]=new int[size][2];
            int idx=0;
            for(Map.Entry<Integer,Integer>e:map.entrySet()){
                arr[idx][0]=e.getKey();
                arr[idx][1]=e.getValue();
                idx++;
            }
            Arrays.sort(arr,(a,b)->{
             int val=Integer.compare(b[1],a[1]);
             if(val==0){
                 return Integer.compare(a[0],b[0]);
             }else{
                 return val;
             }
            });
                
            ArrayList<Integer>res=new ArrayList<>();
            for(int i=0;i<size;i++){
                int freq=arr[i][1];
                for(int j=0;j<freq;j++)
                  res.add(arr[i][0]);
            }
            return res;
    }
}