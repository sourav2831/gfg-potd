//Shortest Prime Path

class Solution{
    int prime[];
    int solve(int num1,int num2){
        if(num1 == num2)return 0;
        fillPrime();
        boolean vis[] = new boolean[10001];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{num1, 0});
        while(!queue.isEmpty()){
            int current[] = queue.poll();
            int cur = current[0];
            int step = current[1];
            vis[cur] = true;
            if(cur == num2)return step;
            String s = Integer.toString(cur);
            for(int i=0;i<4;i++){
                for(char ch = '0';ch <= '9'; ch++){
                    if(ch == s.charAt(i) ||( ch == '0' && i==0))continue;
                    String nxt = s;
                    nxt = s.substring(0, i) + ch + s.substring(i+1);
                    int nxtN = Integer.valueOf(nxt);
                    if(prime[nxtN] == 1 && !vis[nxtN]){
                        queue.add(new int[]{nxtN, step+1});
                    }
                }
            }
        }
        return -1;
    }
    void fillPrime(){
        prime = new int[10001];
        Arrays.fill(prime, 1);
        prime[1] = 0;
        for(int i=2;i<=9999;i++){
            if(prime[i] == 1){
                for(int j=2;j * i <= 9999;j++){
                    prime[j*i] = 0;
                }
            }
        }
    }
}