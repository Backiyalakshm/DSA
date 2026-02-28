class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double curSum = 0;
        double  maxSum = Integer.MIN_VALUE;
        for(int i =0; i <n; i++){
            curSum += nums[i];
            if( i>= k -1){
              
                maxSum = Math.max(curSum, maxSum);
                curSum -= nums[i - k+1];
            }
        }
        if(maxSum < 0){

        }
        return maxSum /(double) k;
    }
}