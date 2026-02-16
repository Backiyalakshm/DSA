class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int n = nums.length;
        int m = numsDivide.length;
        Arrays.sort(nums);
        int intial = numsDivide[0]; 
        for(int i = 1 ; i < m; i++){
            intial = gcd(intial, numsDivide[i]);
            
         }
         for(int i = 0; i < n; i++){
            if(intial % nums[i] == 0){
                return i;
            }
         }
         return -1;
    }
    public int gcd(int a ,int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}