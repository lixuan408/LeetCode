import java.util.HashMap;
import java.util.Map;

/**
 * @Author : llx
 * @Date : 2024/4/17 11:38
 */
public class LeetCode169 {
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            int candidate = 0;
            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }
            return candidate;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        Solution solution = new LeetCode169().new Solution();
        System.out.println(solution.majorityElement(nums));


        Map<Integer,Integer> rs = new HashMap<>();


        int max = 0;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : rs.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
    }
}
