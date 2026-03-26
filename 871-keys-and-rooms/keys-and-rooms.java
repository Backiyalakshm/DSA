class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) { 
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        dfs(rooms,vis,0);
        for(int i = 0; i< n; i++){
            if(vis[i] == false){
                return false;
            }
        }
        return true;

    }

    void dfs(List<List<Integer>> rooms,boolean[] vis,int node)
    { 
         vis[node] = true;
         for(int nei : rooms.get(node)){
            if(!vis[nei]){
                dfs(rooms,vis,nei);
            }
         }
         }
}