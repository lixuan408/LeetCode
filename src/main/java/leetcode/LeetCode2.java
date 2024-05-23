package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode2 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            int n = nums.length;
            Map<Integer,List<Integer>> map = new HashMap<>();


            for (int i = 0; i < n; i++) {

                int ta = target - nums[i];
                if(map.containsKey(ta)){
                    return new int[]{map.get(ta).get(0),i};
                }


                if(map.containsKey(nums[i])){
                    map.get(nums[i]).add(i);
                }else {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(i);
                    map.put(nums[i],integers);
                }


            }
            return new int[]{-1,-1};
        }
    }

    public static void main(String[] args) {
        Solution solution = new LeetCode2().new Solution();
        int[] nums = new int[]{3,2,4};
        solution.twoSum(nums,6);
    }
}
