class Solution {
    public int numIslands(char[][] grid) {
       if(grid == null || grid.length == 0){
        return 0;
       } 
       int cnt =0 ;
  int row = grid.length;
  int col = grid[0].length;
  for(int i =0; i <row; i++){
    for(int j = 0; j < col; j++){
        if(grid[i][j] == '1'){
            cnt++;
            backtrack(grid, i ,j);
        }
    }
  }
  return cnt;
    }
    public void backtrack(char[][] grid, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';
        backtrack(grid, row-1 ,col);
        backtrack(grid, row,col+1);
        backtrack(grid, row,col-1);
        backtrack(grid, row +1,col);
    }
}