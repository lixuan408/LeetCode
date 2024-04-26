public class LeetCode242 {
    public boolean isAnagram(String s, String t) {

        int len_s = s.length();
        int len_t = t.length();
        if (len_s != len_t)
            return false;

        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
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

    public static void main(String[] args) {
        LeetCode242 leetCode242 = new LeetCode242();
        boolean anagram = leetCode242.isAnagram("", "asda");
    }
}
