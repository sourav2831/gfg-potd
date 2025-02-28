class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        
        int x,y,n=arr.length;
        for(String op:arr){
            switch(op){
                case "+": y=st.pop();
                          x=st.pop();
                          st.push(x+y);
                          break;
                    
                case "-": y=st.pop();
                          x=st.pop();
                          st.push(x-y);
                          break;
                    
                case "*": y=st.pop();
                          x=st.pop();
                          st.push(x*y);
                          break;
                    
                case "/": y=st.pop();
                          x=st.pop();
                          st.push(x/y);
                          break;
                
                default: st.push(Integer.parseInt(op));
                         break;
            }
        }
        return st.peek();

    }
}

