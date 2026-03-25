class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
    int V = numCourses;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
     
      for(int i = 0; i <V;i++){
          adj.add(new ArrayList<>());
      }
      
      for(int[]  edge : prerequisites){
          adj.get(edge[0]).add(edge[1]);
      }
      
      int[] ind = new int[V];
      for(int i = 0; i < V; i++){
          for(int nei : adj.get(i)){
              ind[nei]++;
          }
      }
      
      Queue<Integer> q = new LinkedList<>();
      for(int i = 0 ; i < V; i++){
          if(ind[i] == 0){
              q.add(i);
          }
      }
      
      ArrayList<Integer> res = new ArrayList<>();
      while(!q.isEmpty()){
          int ver = q.poll();
          res.add(ver);
          for(int nei : adj.get(ver)){
              ind[nei]--;
              if(ind[nei] == 0){
                  q.add(nei);
              }
          }
      }

     for(int i : ind){
        if(i != 0){
            return false;
        }
     }
     return true;
    }
}