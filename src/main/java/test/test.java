package test;

import datastruct.GenerateTree;
import datastruct.TreeNode;
import leetcode.LeetCode117;
import leetcode.LeetCode199;

import java.util.List;

/**
 * @Author : llx
 * @Date : 2024/5/22 11:23
 */
public class test {

    public static void main(String[] args) {
        GenerateTree generateTree = new GenerateTree();
        Integer[] trees = new Integer[]{1,2,3,4};
        TreeNode treeNode = generateTree.buildTree(trees);

        LeetCode199.Solution solution = new LeetCode199().new Solution();
        List<Integer> integers = solution.rightSideView(treeNode);
        System.out.println(integers);
    }
}
