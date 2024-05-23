package leetcode;

import datastruct.ListNode;

/**
 * @Author : llx
 * @Date : 2024/4/27 15:03
 */
public class LeetCode82 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(-1,head);
            ListNode cur = dummy;

            while(cur.next!=null && cur.next.next!=null){
                if(cur.next.val==cur.next.next.val){
                    int tmp = cur.next.val;
                    while(cur.next!=null && cur.next.val==tmp){
                        cur.next = cur.next.next;
                    }
                }else{
                    cur = cur.next;
                }
            }
            return dummy.next;
        }
    }
}
