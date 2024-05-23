package leetcode;

import datastruct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : llx
 * @Date : 2024/5/22 10:54
 */
public class LeetCode114 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<TreeNode> arr = new ArrayList<>();

        public void flatten(TreeNode root) {
            preOrder(root);
            int n = arr.size();
            for (int i = 1; i < n; i++) {
                TreeNode prev = arr.get(i-1), curr = arr.get(i);
                prev.right  = curr;
                prev.left = null;
            }
        }

        public void preOrder(TreeNode root) {
            if (root != null) {
                arr.add(root);
                preOrder(root.left);
                preOrder(root.right);
            }
        }
    }
}
