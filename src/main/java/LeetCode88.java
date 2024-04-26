/**
 * @Author : llx
 * @Date : 2024/4/17 10:29
 */
public class LeetCode88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            if (n == 0) {
                return;
            }

            int[] tmp = new int[m + n];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < m && j < n) {
                if (nums1[i] <= nums2[j]) {
                    tmp[k++] = nums1[i++];
                } else {
                    tmp[k++] = nums2[j++];
                }
            }

            if (i == m) {
                while (j < n) {
                    tmp[k++] = nums2[j++];
                }
            } else {
                while (i < m) {
                    tmp[k++] = nums1[i++];
                }
            }

            for (int p = 0; p < (m+n); p++) {
                nums1[p] = tmp[p];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        Solution solution = new LeetCode88().new Solution();
        solution.merge(nums1, 0, nums2, 1);
    }
}
