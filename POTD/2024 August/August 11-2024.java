class Solution {
    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> b.profit-a.profit);
        int maxDeadline = 0;
        for(Job job : arr){
            if(job.deadline > maxDeadline){
                maxDeadline = job.deadline;
            }
        }
        boolean[] slots = new boolean[maxDeadline];
        int jobCount = 0;
        int maxProfit = 0;
        for(Job job : arr){
            for(int j=job.deadline-1; j>=0; j--){
                if(!slots[j]){
                    slots[j] = true;
                    jobCount++;
                    maxProfit += job.profit;
                    break;
                }
            }
        }
        return new int[]{jobCount, maxProfit};
    }
}
