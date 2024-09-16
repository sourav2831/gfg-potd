class Solution{
    static int maxLength(String s){
        int max=0;
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch==')'){
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    max=Math.max(max,i-st.peek());
                }
            }else{
                st.push(i);
            }
            i++;
        }
        return max;
    }
}