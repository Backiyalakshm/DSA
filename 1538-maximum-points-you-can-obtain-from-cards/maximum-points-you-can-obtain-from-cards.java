class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0,rsum = 0, maxsum =0;
        for(int i =0; i < k ; i++)
        {
            lsum += cardPoints[i];
        }
        maxsum = lsum;
        int rightInd = cardPoints.length-1;
        for(int i = k-1; i>= 0; i--)
        {
            lsum = lsum - cardPoints[i];
            rsum = rsum +cardPoints[rightInd--];
            maxsum = max(maxsum, lsum+rsum);
        }
        
        return maxsum;
    }
    public int max(int a , int b)
    {
        return (a < b) ? b:a;
    }
}