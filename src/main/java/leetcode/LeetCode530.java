package leetcode;

import datastruct.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author : llx
 * @Date : 2024/5/24 11:45
 */
public class LeetCode530 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    /**
     * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
     * <p>
     * 差值是一个正数，其数值等于两值之差的绝对值。
     *
     * @param null
     * @author llx
     * @date 2024/5/24 11:45
     * @return
     */
    class Solution1 {
        public List<Integer> nums = new ArrayList<>();

        public int getMinimumDifference(TreeNode root) {
            preOrder(root);
            nums.sort((a, b) -> {
                return a - b;
            });
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < nums.size(); i++) {
                int tmp = Math.abs(nums.get(i) - nums.get(i - 1));
                if (tmp < min) {
                    min = tmp;
                }
            }
            return min;
        }

        public void preOrder(TreeNode root) {
            if (root != null) {
                nums.add(root.val);
                preOrder(root.left);
                preOrder(root.right);
            }
        }
    }

    /**
     * 方法一中使用的是扁平化 + 排序的策略，下面的方法是考虑到二叉搜索树的中序序列本身就是排序好了的特性入手
     * @author llx
     * @param null
     * @date 2024/5/24 12:04
     * @return
     */
    class Solution2 {
        public Integer pre = null;
        public int min = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode root) {
            inOrder(root);
            return min;
        }

        public void inOrder(TreeNode root) {
            if (root != null) {
                inOrder(root.left);
                if (pre != null) {
                    int tmp = root.val - pre;
                    if (tmp < min) {
                        min = tmp;
                    }
                }
                pre = root.val;
                inOrder(root.right);
            }
        }
    }
}
