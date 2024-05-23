package leetcode;

import datastruct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : llx
 * @Date : 2024/5/23 15:51
 */
public class LeetCode236 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    /**
     * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
     * <p>
     * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
     *
     * @param null
     * @author llx
     * @date 2024/5/23 15:51
     * @return
     */
    class Solution {

        public TreeNode rs;
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            boolean parents = findParents(root, p, q);
            return rs;
        }

        public boolean findParents(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) return false;
            boolean lson = findParents(root.left, p, q);
            boolean rson = findParents(root.right, p, q);

            if((lson && rson)||((lson || rson)&&(root.val==p.val || root.val==q.val))){
                rs = root;
            }

            return lson || rson || root.val==p.val || root.val==q.val;

        }


    }
}
