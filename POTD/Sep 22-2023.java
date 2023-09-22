//First and last occurrences of x

class GFG {
    ArrayList<Integer> find(int arr[], int n, int x){
        ArrayList<Integer> al = new ArrayList<>(2);
        int a =-1,b =-1;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                a=i;
                break;
            }
        }
        for(int i= n-1;i>=0;i--){
            if(arr[i] == x){
                b=i;
                break;
            }
        }
        al.add(a);
        al.add(b);
        return al;
    }
}