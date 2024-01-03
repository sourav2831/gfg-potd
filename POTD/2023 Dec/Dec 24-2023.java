//Buy Maximum Stocks if i stocks can be bought on i-th day

class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
       HashMap<Integer,Integer>h=new HashMap<>();
       for(int i=0;i<n;i++){
           if(h.containsKey(price[i])){
               h.put(price[i],h.get(price[i])+(i+1));
           }
           else{
           h.put(price[i],i+1);
           }
       }
       Arrays.sort(price);
        int x=0;
        for(int i=0;i<n;i++){
            int j=h.get(price[i]);
            while(j>0 && (k-price[i])>=0){
                k=k-price[i];
                x++;
                j--;
            }
            h.put(price[i],0);
        }
        return x;
    }
}