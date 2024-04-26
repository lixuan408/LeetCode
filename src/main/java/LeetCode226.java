//import datastruct.TreeNode;

public class LeetCode226 {
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
//    class Solution {
//        public TreeNode invertTree(TreeNode root) {
//            TreeNode raw = root;
//            TreeNode head;
//            TreeNode p2;
//            Queue<TreeNode> bfs = new ArrayDeque<>();
//            bfs.add(raw);
//            while(!bfs.isEmpty()){
//                TreeNode cur_node = bfs.poll();
//                if (cur_node.left!=null)
//                    bfs.add(cur_node.left);
//                if(cur_node.right!=null)
//                    bfs.add(cur_node.right);
//                rs = new TreeNode(cur_node.val);
//            }
//        }
//    }
}
