package leetcode;

import datastruct.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author : llx
 * @Date : 2024/4/28 10:58
 */
public class LeetCode61 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode rotateRight1(ListNode head, int k) {
            Deque<ListNode> stack = new LinkedList<>();
            ListNode cur = head;
            while (cur != null) {
                stack.push(cur);
                cur = cur.next;
            }
            int length = stack.size();
            if(length==0)
                return head;
            k %= stack.size();
            int count = 0;
            while (!stack.isEmpty()) {
                ListNode pop = stack.pop();
                count++;
                if (count == 1) {
                    pop.next = head;
                }
                if (count == (k + 1)) {
                    head = pop.next;
                    pop.next = null;
                    break;
                }
            }
            return head;
        }

        public ListNode rotateRight2(ListNode head, int k) {
            ListNode cur = head;
            ListNode pre = null;
            ListNode rs = null;
            int length = 0;
            while (cur != null) {
                length++;
                pre = cur;
                cur = cur.next;
            }
            if(length ==0){
                return head;
            }
            pre.next = head;

            k %= length;
            int count = 0;
            while(head!=null){
                if(count==(length-k-1)){
                    rs = head.next;
                    head.next = null;
                    break;
                }
                count++;
                head = head.next;
            }
            return rs;
        }
    }
}
