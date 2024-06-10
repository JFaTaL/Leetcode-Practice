import java.util.*;
public class solution {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> numMap = new HashMap<>();
             int n = nums.length;
    
            for (int i = 0; i < n; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement)) {
                    return new int[]{numMap.get(complement), i};
                }
                numMap.put(nums[i], i);
            }
    
            return new int[]{};
        }
    }
}
