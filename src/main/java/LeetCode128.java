import java.util.HashSet;

public class LeetCode128 {
    class Solution {
        public int longestConsecutive(int[] nums) {
            //1.哈希表+枚举
            HashSet<Integer> sets = new HashSet<>();
            int max = 0;
            for(int cur :nums){
                sets.add(cur);
            }
            for (Integer set : sets) {
                if (sets.contains(set-1)) {
                    continue;
                }
                int i = 1;
                while(sets.contains(set+i)){
                    i++;
                }
                max = Math.max(max,(i));
            }
            return max;
        }
    }
}
