package leetcode;

import java.util.ArrayList;

/**
 * Created by llx
 * Created Date : 2024/4/10.
 */
public class LeetCode155 {
    class MinStack {

        private ArrayList<Integer> rs = new ArrayList<>();
        private ArrayList<Integer> min = new ArrayList<>();


        private int length = 0;
        public MinStack() {
        }

        public void push(int val) {
            if(min.size()==0 || val<=this.min.get(min.size()-1)){
                this.min.add(val);
            }
            rs.add(val);
            this.length = rs.size();
        }

        public void pop() {
            if(rs.get(rs.size()-1).intValue() == min.get(min.size()-1).intValue()){
                min.remove(min.size()-1);
            }
            rs.remove(this.length-1);
            this.length--;
        }

        public int top() {
            return rs.get(this.length-1);
        }

        public int getMin() {
            return this.min.get(min.size()-1);
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new LeetCode155().new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);

        minStack.pop();

        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
