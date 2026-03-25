class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // if(prerequisites.length == 0){
        //     return new int[]{0};
        // }
        int V = numCourses;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
     
      for(int i = 0; i <V;i++){
          adj.add(new ArrayList<>());
      }
      
      for(int[]  edge : prerequisites){
          adj.get(edge[1]).add(edge[0]);
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
  int[] ans = new int[res.size()];
  for(int i =0 ; i < res.size(); i++){
    ans[i] = res.get(i);
 }
 if(V == ans.length){
     return ans;
    }
    else{
        return new int[]{};
    }
    }

}