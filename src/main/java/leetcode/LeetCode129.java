package leetcode;

import datastruct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : llx
 * @Date : 2024/5/22 12:50
 */
public class LeetCode129 {
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
     * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
     * 每条从根节点到叶节点的路径都代表一个数字：
     *
     * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
     * 计算从根节点到叶节点生成的 所有数字之和 。
     *
     * 叶节点 是指没有子节点的节点。
     * @author llx
     * @param null
     * @date 2024/5/22 12:51
     * @return
     */
    class Solution {
        public List<Integer> tmp = new ArrayList<>();
        public int sumNumbers(TreeNode root) {
            int rs = 0;
            preOrder(root,0);
            for (int i = 0; i < tmp.size(); i++) {
                rs+=tmp.get(i);
            }
            return rs;
        }

        public void preOrder(TreeNode root,int rs){
            if(root !=null){
                rs = rs*10+root.val;
                if(root.left==null && root.right==null){
                    tmp.add(rs);
                }else{
                    preOrder(root.left,rs);
                    preOrder(root.right,rs);
                }
            }
        }
    }
}
