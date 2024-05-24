package datastruct;

/**
 * @Author : llx
 * @Date : 2024/5/24 10:49
 */
import java.util.*;

public class GenerateTree {
    public TreeNode buildTree(Integer[] elements) {
        if (elements == null || elements.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(elements[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < elements.length) {
            TreeNode current = queue.poll();
            if (current != null) {
                if (elements[i] != null) {
                    current.left = new TreeNode(elements[i]);
                    queue.offer(current.left);
                }
                i++;
                if (i < elements.length && elements[i] != null) {
                    current.right = new TreeNode(elements[i]);
                    queue.offer(current.right);
                }
                i++;
            }
        }
        return root;
    }

    // For testing purpose: Print the tree in level order to verify
    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                System.out.print(current.val + " ");
                queue.offer(current.left);
                queue.offer(current.right);
            } else {
                System.out.print("null ");
            }
        }
    }

    public static void main(String[] args) {
        GenerateTree solution = new GenerateTree();
        Integer[] elements = {1, 2, 3, null, 5, null, 4};
        TreeNode root = solution.buildTree(elements);
        solution.printTree(root);  // To verify the tree structure
    }
}
