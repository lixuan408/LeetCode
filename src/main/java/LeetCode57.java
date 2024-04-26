import java.util.ArrayList;
import java.util.List;

public class LeetCode57 {
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            int rows = intervals.length;
            int cols = intervals[0].length;
            List<int[]> nums = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                if (intervals[i][0] >= newInterval[0]) {
                    nums.add(newInterval);
                    nums.add(intervals[i]);
                } else {
                    nums.add(intervals[i]);
                }
            }

            return merge(nums.toArray(new int[nums.size()][]));
        }

        public int[][] merge(int[][] intervals) {
            int rows = intervals.length;
            int cols = intervals[0].length;
            List<int[]> rs = new ArrayList<>();
            int left = intervals[0][0];
            int right = intervals[0][1];
            for (int i = 1; i < rows; i++) {
                if (right >= intervals[i][0]) {
                    right = Math.max(right, intervals[i][1]);
                } else {
                    rs.add(new int[]{left, right});
                    left = intervals[i][0];
                    right = intervals[i][1];
                }

            }

            return rs.toArray(new int[rs.size()][]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new LeetCode57().new Solution();
        int[][] source = new int[][]{{1, 3}, {6, 9}};
        int[] insert = new int[]{2,5};
        int[][] insert1 = solution.insert(source, insert);

    }
}
