class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return fun(nums,k) - fun(nums,k -1);
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
         sum += (nums[r]%2);
         while(sum > goal)
         {
            sum = sum - (nums[l] %2);
            l = l+1;
         }
         cnt+=(r-l+1);
         r = r+1;
        }
        return cnt;
    }
}