package leetcode;

/**
 * @Author : llx
 * @Date : 2024/4/17 11:18
 */
public class LeetCode26 {

    class Solution {
        public int removeDuplicates(int[] nums) {

            int cur = 0;
            int n = nums.length-1;
            for(int i=0;i<n;i++){
                if(i==0){
                    nums[cur++] = nums[i];
                    continue;
                }
                if(nums[i-1]!=nums[i]){
                    nums[cur++] = nums[i];
                }
            }

            return cur;
        }
    }

    public static void main(String[] args) {

        new LeetCode26().new Solution().removeDuplicates(new int[]{1,1,2});
    }
}
