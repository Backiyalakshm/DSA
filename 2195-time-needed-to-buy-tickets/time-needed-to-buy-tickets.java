class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++){
            q.add(new int[]{i, tickets[i]});
        }

        int cnt = 0;

        while(!q.isEmpty()){
            int[] ele = q.poll();   // take the front person
            ele[1] = ele[1] - 1;    // one ticket bought
            cnt++;

            // if k finished buying tickets → stop
            if(ele[0] == k && ele[1] == 0){
                break;
            }

            // if still tickets left → go back to queue
            if(ele[1] > 0){
                q.add(ele);
            }
        }

        return cnt;
    }
}