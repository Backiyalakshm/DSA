import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        Arrays.sort(nums); // ✅ important

        backtrack(nums, result, temp, visited);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result,
                          List<Integer> temp, boolean[] visited) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) continue;

            // ✅ skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }

            visited[i] = true;
            temp.add(nums[i]);

            backtrack(nums, result, temp, visited);

            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}