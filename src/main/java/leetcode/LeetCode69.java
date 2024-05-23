package leetcode;

/**
 * @Author : llx
 * @Date : 2024/5/22 13:23
 */
public class LeetCode69 {

    /**
     * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
     * <p>
     * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
     * <p>
     * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
     *
     * @param null
     * @author llx
     * @date 2024/5/22 13:24
     * @return
     */
    class Solution1 {
        /**
         * 方法一 ： 遍历
         *
         * @param x
         * @return int
         * @author llx
         * @date 2024/5/22 13:25
         */
        public int mySqrt(int x) {
            if (x == 0) {
                return 0;
            }
            long curr = 1;
            long pre = 0;
            while (curr * curr <= x) {
                pre = curr;
                curr++;
            }
            return (int) pre;
        }
    }

    class Solution2 {
        /**
         * 方法一 ： 二分
         *
         * @param x
         * @return int
         * @author llx
         * @date 2024/5/22 13:25
         */
        public boolean flag = false;
        public int mySqrt(int x) {

            int i = binarySearch(0, x, x);
            return  flag ? i : i-1;
        }

        public int binarySearch(int down,int up, int target) {
            if(down < up){
                int mid = down + (up-down)/2;
                int pow = mid * mid;
                if (pow > target) {
                    return binarySearch(down,mid-1,target);
                }else  if(pow < target){
                    return binarySearch(mid+1,up,target);
                }else{
                    flag = true;
                    return mid;
                }
            }
            return down;
        }
    }

}
