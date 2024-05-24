package leetcode;

import datastruct.GenerateTree;
import datastruct.TreeNode;

import java.util.*;

/**
 * @Author : llx
 * @Date : 2024/5/24 9:51
 */
public class LeetCode199 {

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
     * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
     *
     * @param null
     * @author llx
     * @date 2024/5/24 9:51
     * @return
     */
    public class Solution {
        public List<Integer> rightSideView(TreeNode root) {

            List<Integer> rs = new ArrayList<>();
            Deque<TreeNode> qu = new LinkedList<>();
            if (root == null) {
                return rs;
            }
            qu.offer(root);
            qu.offer(null);
            while (!qu.isEmpty()) {
                TreeNode poll = qu.poll();
                if (poll == null) {
                    if (!qu.isEmpty()) {
                        qu.offer(null);
                    }
                } else {
                    if (qu.peek() == null) {
                        rs.add(poll.val);
                    }
                    if (poll.left != null) {
                        qu.offer(poll.left);
                    }
                    if (poll.right != null) {
                        qu.offer(poll.right);
                    }
                }
            }
            return rs;
        }
    }


}
