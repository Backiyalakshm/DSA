class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       
        if(color != image[sr][sc])
        {
             int ori = image[sr][sc];
             backtrack(image,sr,sc,ori,color);
        }
        return image;
    }
    public void backtrack(int[][] image, int sr, int sc,int org, int color){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length ||image[sr][sc] != org){
            return;
        }
        image[sr][sc] = color;
       backtrack(image,sr+1,sc,org,color);
        backtrack(image,sr,sc+1,org,color);
         backtrack(image,sr-1,sc,org,color);
          backtrack(image,sr,sc-1,org,color);


    }
}
