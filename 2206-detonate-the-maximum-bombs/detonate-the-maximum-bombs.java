class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i= 0; i< n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i =0; i< n; i++){
            long x1 = bombs[i][0];
            long y1 = bombs[i][1];
            long r1 = bombs[i][2];

            for(int j = 0; j < n; j++){
                if(i==j){
                    continue;
                }

                long x2 = bombs[j][0];
                long y2 = bombs[j][1];

             long dx = x1 - x2;
             long dy = y1 - y2;
             if(dx * dx + dy * dy <= r1*r1){
              graph.get(i).add(j);
             }

            }
        }

        int max = 0;
       
         for(int i = 0; i< n; i++){
             boolean[] vis = new boolean[n];
            int cnt = dfs(graph,vis,i);
            if(max < cnt){
                max = cnt;
            }
         }
        
        return max;
    } 
    public int dfs( List<List<Integer>> graph,boolean[] vis, int node){
        int cnt = 1;
        vis[node] = true;
        for(int nei : graph.get(node)){
            if(!vis[nei]){
                cnt += dfs(graph,vis,nei);
            }
        }
        return cnt;
    }
}