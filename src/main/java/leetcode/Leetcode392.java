package leetcode;

public class Leetcode392 {


    private Solution so = new Solution();

    class Solution {

        public Solution() {
        }

        public boolean isSubsequence(String s, String t) {

            int start = 0;
            int end = s.length();
            char[] ss = s.toCharArray();
            for (int i = 0; i < t.length(); i++) {
                int cur = find(ss,start,t.charAt(i));
                if (cur != -1) {
                    start = 1 + cur;
                } else {
                    return false;
                }
            }
            return true;
        }

        public int find(char[] source, int start,char target) {
            for (int i = start; i < source.length; i++) {
                if (source[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Leetcode392 leetcode392 = new Leetcode392();

//        boolean subsequence = leetcode392.so.isSubsequence("ahbgdc", "agc");
        boolean subsequence = leetcode392.so.isSubsequence("ahbgdc", "axc");
        System.out.println(subsequence);
    }
}
