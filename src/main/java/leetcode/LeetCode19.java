package leetcode;

import datastruct.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author : llx
 * @Date : 2024/4/26 11:19
 */
public class LeetCode19 {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            Deque<ListNode> stack = new LinkedList<>();
            ListNode cur = head;
            while(cur!=null){
                stack.push(cur);
                cur = cur.next;
            }
            int count = 0;
            ListNode pre = null;
            ListNode tmp = null;
            while(!stack.isEmpty()){
                cur = stack.pop();
                count++;
                if(count==n){
                    tmp = cur;
                }else if(count==n+1){
                    pre = cur;
                    break;
                }
            }

            if(pre==null){
                return head.next;
            }
            pre.next = tmp.next;
            return head;
        }
    }
}
