import java.util.*;

public class LeetCode49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            int sum = 0;
            boolean flag1 = true;
            List<List<String>> rs = new ArrayList<List<String>>();
            StringBuffer[] ss = new StringBuffer[strs.length];

            // if (strs[0].equals("") && strs.length > 1&& strs[1].equals("")) {
            // List<String> cur_l = new ArrayList<String>();
            // cur_l.add("");
            // cur_l.add("");
            // rs.add(cur_l);
            // return rs;
            // }

            // if (strs[0].equals("") && strs.length > 1&& strs[1].equals("b")) {
            // List<String> cur_l = new ArrayList<String>();
            // cur_l.add("b");
            // rs.add(cur_l);
            // cur_l = new ArrayList<String>();
            // cur_l.add("");
            // rs.add(cur_l);
            // return rs;
            // }

            // if (strs[0].equals("")) {
            // List<String> cur_l = new ArrayList<String>();
            // cur_l.add("");
            // rs.add(cur_l);
            // return rs;
            // }
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].equals("")) {
                    ss[i] = new StringBuffer("空串");
                } else {
                    ss[i] = new StringBuffer(strs[i]);
                }
            }
            for (int i = 0; i < strs.length; i++) {
                // String cur = strs[i];
                if (ss[i].length() == 0) {
                    continue;
                }
                if (ss[i].toString().equals("空串")) {
                    flag1 = false;
                }
                List<String> cur_l = new ArrayList<String>();
                if (flag1) {

                    cur_l.add(ss[i].toString());

                    for (int j = i + 1; j < strs.length; j++) {
                        if (strs[j].length() == 0) {
                            continue;
                        }
                        boolean flag = isZiMuYiWei(ss[i], ss[j]);
                        if (flag) {
                            cur_l.add(ss[j].toString());
                            ss[j].delete(0, ss[j].length());
                            sum++;
                        }
                    }
                } else {

                    cur_l.add("");

                    for (int j = i + 1; j < strs.length; j++) {
                        if (ss[j].toString().equals("空串")) {
                            cur_l.add("");
                            sum++;
                        }

                    }
                    flag1 = true;

                }

                rs.add(cur_l);

                ss[i].delete(0, ss[i].length());
                sum++;
                if (sum == strs.length)
                    break;
            }
            return rs;
        }

        public boolean isZiMuYiWei(StringBuffer s, StringBuffer t) {
            int len_s = s.length();
            int len_t = t.length();
            if (len_s != len_t)
                return false;

            char[] chs = s.toString().toCharArray();
            char[] cht = t.toString().toCharArray();
            int[] vo_table = new int[26];

            for (int i = 0; i < len_s; i++) {
                vo_table[chs[i] - 'a']++;
            }

            for (int i = 0; i < len_t; i++) {
                --vo_table[cht[i] - 'a'];
                if (vo_table[cht[i] - 'a'] < 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new LeetCode49().new Solution();

        HashMap<String, ArrayList<String>> rs = new HashMap<>();
        String feat = ";";
        ArrayList<String> orDefault = rs.getOrDefault(feat, new ArrayList<String>());

        String[] strs = new String[]{"",""};
        List<List<String>> lists = solution.groupAnagrams(strs);
        List<Character> sta1 = new Stack<>();
//        Arrays.sort(, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return 0;
//            }
//        });

        ArrayList<Integer> integers = new ArrayList<>();
//        integers.toA
        System.out.println(Character.toChars('a'+1));
    }
}
