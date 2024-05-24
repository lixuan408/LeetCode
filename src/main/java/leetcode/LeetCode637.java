package leetcode;
import datastruct.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author : llx
 * @Date : 2024/5/24 11:25
 */
public class LeetCode637 {

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
     * 给定一个非空二叉树的根节点 root , 以数组的形式返回每一层节点的平均值。与实际答案相差 10-5 以内的答案可以被接受。
     * @author llx
     * @param null
     * @date 2024/5/24 11:25
     * @return
     */
    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            Deque<TreeNode> qu = new LinkedList<>();
            List<Double> rs = new ArrayList<>();
            if(root==null){
                return rs;
            }
            qu.offer(root);
            while(!qu.isEmpty()){
                double tmp = 0.;
                int n = qu.size();
                for(int i=0;i<n;i++){
                    TreeNode poll = qu.poll();
                    TreeNode left = poll.left, right = poll.right;
                    if(left!=null){
                        qu.offer(poll.left);
                    }
                    if(right!=null){
                        qu.offer(poll.right);
                    }
                    tmp+=poll.val;
                }
                tmp/=n;
                rs.add(tmp);
            }
            return rs;

        }
    }
}
