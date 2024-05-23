package leetcode;

import datastruct.Node;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author : llx
 * @Date : 2024/5/21 22:44
 */
public class LeetCode117 {
    /*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

    class Solution {
        /**
         * 层序遍历，在每层的末尾添加一个NULL
         * @author llx
         * @param root
         * @date 2024/5/22 10:53
         * @return datastruct.Node
         */
        public Node connect(Node root) {
            Deque<Node> qu = new LinkedList<>();
            if (root == null) {
                return null;
            }
            qu.offer(root);
            qu.offer(null);
            while (!qu.isEmpty()) {
                Node poll = qu.poll();

                if (poll == null) {
                    if (!qu.isEmpty()) {
                        qu.offer(null);
                    }
                } else {
                    poll.next = qu.peek();
                    if (poll.left != null) {
                        qu.offer(poll.left);
                    }
                    if (poll.right != null) {
                        qu.offer(poll.right);
                    }
                }
            }
            return root;
        }
    }
}
