class Solution {
    public void sort012(ArrayList<Integer> arr) {
        int zero = 0;
        int first = 0;
        int sec = arr.size()-1;
        while(first<= sec){
            switch(arr.get(first)){
                case 0:{
                    int temp = arr.get(zero);
                    arr.set(zero, arr.get(first));
                    arr.set(first, temp);
                     zero++;
                     first++;
                     break;
                }
                case 1: {
                    first++;
                    break;
                }
                case 2:{
                    int temp = arr.get(first);
                    arr.set(first, arr.get(sec));
                    arr.set(sec, temp);
                     sec--;
                     break;
                }
            }
        }
    }
}
