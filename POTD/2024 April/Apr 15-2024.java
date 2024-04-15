//Count the elements

class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q) {
        ArrayList <Integer> ans= new ArrayList<>();
        for(int i=0;i<query.length;i++){
            int index = query[i];
            int element = a[index];
            int count = 0;
            for(int j=0;j<n;j++){
                if(b[j] <= element){
                    count++;
                }
            }
            ans.add(count);
        }
        int arr[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
