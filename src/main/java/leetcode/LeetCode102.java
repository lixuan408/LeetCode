package leetcode;

import datastruct.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author : llx
 * @Date : 2024/5/24 11:39
 */
public class LeetCode102 {

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
     * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
     * @author llx
     * @param null
     * @date 2024/5/24 11:39
     * @return
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Deque<TreeNode> qu = new LinkedList<>();
            List<List<Integer>> rs = new ArrayList<>();
            if(root==null){
                return rs;
            }
            qu.offer(root);
            while(!qu.isEmpty()){
                int n = qu.size();
                List<Integer> tmp = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    TreeNode poll = qu.poll();
                    tmp.add(poll.val);
                    TreeNode left = poll.left,right = poll.right;
                    if (left!=null){
                        qu.offer(left);
                    }
                    if (right!=null){
                        qu.offer(right);
                    }
                }
                rs.add(tmp);
            }
            return rs;
        }
    }

}
