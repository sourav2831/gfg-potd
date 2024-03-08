//Check if frequencies can be equal

class Solution {
    boolean sameFreq(String s) {
        HashMap<Character,Integer> frequency = new HashMap<Character,Integer>();
        char iteratorChar = 'z';
        int max = 0;
        int min = 0;
        int maxFreq = 0;
        for(int i=0;i<s.length(); i++){
            char key = s.charAt(i);
            if(frequency.containsKey(key)){
                frequency.put(key, frequency.get(key)+1);
            }else{
                frequency.put(key, 1);
            }
            
            if(iteratorChar > s.charAt(i)){
                iteratorChar = s.charAt(i);
            }
        }
        if(frequency.size() == 1){
            return true;
        }
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        for(int i=((int)iteratorChar);i<=122;i++){
            if(frequency.get((char)i) != null){
                if(frequency.get((char)(i)) < min){
                    min = frequency.get((char)i);
                }
                
                if(frequency.get((char)i) > max){
                    max = frequency.get((char)i);
                    maxFreq=1;
                }else if(frequency.get((char)i) == max){
                    maxFreq++;
                }
            }
            
        }
        
        if((max-min)==1){
            if(maxFreq == 1){
               return true; 
            }else if(min == 1){
                if((max*maxFreq)+min == s.length()){
                    return true;
                }
            }
        }else if(min==max){
            return true;
        }else if(min == 1){
            if((max*maxFreq)+min == s.length()){
                return true;
            }
        }
         return false;
    }
}