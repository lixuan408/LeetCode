import java.util.Arrays;

public class Leetcode209 {
    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            Arrays.sort(nums);
            int sum =0;
            for(int i=nums.length-1;i>=0;i--){
                sum+=nums[i];
                if(sum>=target){
                    return nums.length-i;
                }
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{12,28,83,4,25,26,25,2,25,25,25,12};
        int rs = solution.minSubArrayLen(213,nums);
        System.out.println(rs);
        int a = Integer.MAX_VALUE;
        System.out.println(a == Integer.MAX_VALUE);


        int[] nums1 = new int[]{1,2,3,5,7};
        int i = Arrays.binarySearch(nums1, 6);
        int j = Arrays.binarySearch(nums1, 8);
        System.out.println(Math.abs(i));
        System.out.println(Math.abs(j));
    }
}
