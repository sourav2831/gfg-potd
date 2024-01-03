//String's Count

class Solution { 
    static long countStr(long n){
	    long ans = 1+(n*2)+(n*((n*n)-1)/2);
        return ans; 
	}
} 