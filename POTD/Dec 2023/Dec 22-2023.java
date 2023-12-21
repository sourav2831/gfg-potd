//Maximum Meetings in One Room

class Pair{
    int S;
    int F;
    int index;
    Pair(int s,int f,int index){
        this.S = s;
        this.F = f;
        this.index = index;
    }
}
class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
     
       ArrayList<Pair> meetings = new ArrayList<>();
       for(int i=0; i<N; i++){
           meetings.add(new Pair(S[i],F[i],i));
       }
       Collections.sort(meetings,(a,b) ->a.F - b.F); //sorting by endof Meeting
       
       ArrayList<Integer> result  = new ArrayList<>();
       result.add(meetings.get(0).index+1); //adding first meeting index;
       
       int prevf = meetings.get(0).F; // first meeting endtime
       for(int i=1; i<N; i++){
           if(meetings.get(i).S > prevf){ // if my i of starting time is greater than prev meeting end time than 
               result.add(meetings.get(i).index+1); //add the respective index with 1 increment
               prevf = meetings.get(i).F; // update the prevmeeting
           }
       }
       Collections.sort(result); // sort the result list 
       return result;
    }
}