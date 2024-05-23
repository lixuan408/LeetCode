package leetcode;

import datastruct.TreeNode;

/**
 * @Author : llx
 * @Date : 2024/5/22 11:21
 */
public class LeetCode112 {
    /**
     * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。如果存在，返回 true ；否则，返回 false 。
     *
     * @param null
     * @author llx
     * @date 2024/5/22 11:26
     * @return
     */
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            return preOrder(root, 0, targetSum);
        }

        public boolean preOrder(TreeNode root, int rs, int targetSum) {
            if (root != null) {
                rs += root.val;
                if (rs == targetSum && root.left == null && root.right == null) {
                    return true;
                } else {
                    boolean left = preOrder(root.left, rs, targetSum);
                    boolean right = preOrder(root.right, rs, targetSum);
                    return left || right;
                }
            }
            return false;
        }
    }
}
