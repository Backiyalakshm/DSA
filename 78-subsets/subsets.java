class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int subsetCount = 1 << nums.length;  // 2^n subsets
        List<List<Integer>> ans = new ArrayList<>();

        for (int num = 0; num < subsetCount; num++) {
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((num & (1 << i)) != 0) {
                    li.add(nums[i]);
                }
            }
            ans.add(li);
        }
        return ans;
    }
}
