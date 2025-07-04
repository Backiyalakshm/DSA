class Solution {
public:
    long long subArrayRanges(vector<int>& nums) {
      long long ans =0;
      for(int i =0; i< nums.size(); i++)
      {
        int smin = INT_MAX;
        int smax = INT_MIN;
        for(int j= i; j < nums.size(); j++)
        {
            smin = min(smin,nums[j]);
            smax = max(smax, nums[j]);
            ans += (smax - smin);
        }
      }  
      return ans;
    }
};