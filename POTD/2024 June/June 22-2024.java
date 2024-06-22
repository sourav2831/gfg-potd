class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String arr[]=sentence.split(" ");
        long max=-1;
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr[i].length();j++){
                if((arr[i].charAt(j))-'0'==9){
                    flag=false;
                    break;
                }
                else if(Character.isDigit(arr[i].charAt(j)))
                     flag=true;
                else
                     flag=false;
            }
            if(flag){
                max=Math.max(max,Long.parseLong(arr[i]));
            }
        }
        return max;
    }
}