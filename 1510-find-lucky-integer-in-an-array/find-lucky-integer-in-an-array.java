import java.util.*;

class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = -1;

        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                result = Math.max(result, key);
            }
        }

        return result;
    }
}