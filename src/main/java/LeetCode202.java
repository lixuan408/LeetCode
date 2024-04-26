import java.util.ArrayList;
import java.util.List;

public class LeetCode202 {

    class Solution {
        public boolean isHappy(int n) {

            int rs = n;
            while(rs != 1){
                rs = getSum(rs);
            }

            return true;
        }

        public int getSum(int source){
            List<Integer> rs = new ArrayList<>();

            while(source != 0){
                int chu = source/10;
                int yu = source % 10;
                rs.add(yu);
                source = chu;
            }

            int sum = 0;
            for(int elem: rs){
                sum+=elem*elem;
            }
            return sum;

        }
    }

    public static void main(String[] args) {
        Solution solution = new LeetCode202().new Solution();

        boolean rs = solution.isHappy(2);
        System.out.println(rs);
    }
}
