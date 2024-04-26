public class Leetcode1 {
    public Leetcode1() {
    }

    // 151 反转字符串中的单词
    public static String reverseWords(String s) {
        String[] ars = s.split("");
        int n = ars.length;
        String rs = "";
        for (int j = n - 1; j >= 0; j--) {
            rs += ars[j] + " ";
        }
        return rs.substring(0, rs.length() - 1);
    }


    public static String convert(String s, int numRows) {

        int start = 0;
        int n = s.length();
        boolean flag = true;
        String ss = "";
        while (start < n) {
            if (flag) {
                ss += s.substring(start, Math.min(start + numRows, n));
                start += numRows;
                flag = false;
            } else {
                ss += "-" + reverse(s.substring(start, start + Math.min(numRows - 2, n))) + "-";
                start += numRows - 2;
                flag = true;
            }


        }
        String rs = "";
        int row = 0;
        while (row < numRows) {
            for (int i = row; i < ss.length(); i += numRows) {
                if (ss.substring(i, i + 1).equals("-")) {
                    continue;
                }
                rs += ss.substring(i, i + 1);


            }
            row += 1;
        }
        return rs;

    }

    public static String reverse(String s) {
        int n = s.length();
        String ss = "";
        for (int i = n - 1; i >= 0; i--) {
            ss += s.substring(i, i+1);
        }
        return ss;
    }

    public static void main(String[] args) {
        reverseWords("  hello world  ");

        convert("PAYPALISHIRING", 4);
    }

}
