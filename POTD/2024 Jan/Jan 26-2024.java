//Fractional Knapsack

class Solution{
    double fractionalKnapsack(int w, Item arr[], int n) {
        Arrays.sort(arr,(a,b)->(b.value*a.weight)-(a.value*b.weight));
        double ans=0.0;
        int i=0;
        while(i<n){
            if(w==0)return ans;
            if(arr[i].weight<=w){
                ans+=(arr[i].value);
                w-=arr[i].weight;
            }else{
                double fraction=((double)w/(double)arr[i].weight)*arr[i].value;
                ans+=fraction;
                return ans;
            }
            i++;
        }
        return ans;
    }
}