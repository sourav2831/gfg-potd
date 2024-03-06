//Search Pattern (Rabin-Karp Algorithm)

class Solution
{   
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        int n = text.length();
        int m = pattern.length();
        ArrayList<Integer> idx=new ArrayList<>();
        for(int i=0; i<n-m+1; i++){
            String temp=text.substring(i,m+i);
            if(temp.equals(pattern)){
                idx.add(i+1);
            }
        }
        return idx;
    }
}