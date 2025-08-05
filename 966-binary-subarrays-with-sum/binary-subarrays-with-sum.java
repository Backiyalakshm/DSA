class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return fun(nums,goal) - fun(nums,goal -1);
    }
    public int fun(int[] nums , int goal)
    {
        int l =0, r =0, sum =0, cnt =0;
        if(goal < 0 )
        {
            return 0;
        }
        while(r < nums.length)
        {
         sum += nums[r];
         while(sum > goal)
         {
            sum = sum - nums[l];
            l = l+1;
         }
         cnt+=(r-l+1);
         r = r+1;
        }
        return cnt;
    }
}